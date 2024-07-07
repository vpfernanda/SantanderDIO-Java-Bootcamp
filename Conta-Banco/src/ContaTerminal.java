/**@author Fernanda*/
import java.util.*;

public class ContaTerminal {
    private int accountNumber; 
    private String agencyCode;
    private String clientName;
    private double balance = 0;

    ContaTerminal(String agency, String client){
        agencyCode = agency;
        clientName = client;
        Random number = new Random();
        accountNumber = 10000 + number.nextInt(90000);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAgencyCode() {
        return agencyCode;
    }
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    /** 
     * @return String containing the bank account details. 
     */
    public String toString(){
        return "Hello! Your account was created succesfully. Your details are described below:\n"+
        "Name: "+clientName+"\n"+
        "Agency number: "+agencyCode+"\n"+
        "Account number: "+accountNumber+"\n"+
        "Balance: R$"+String.format("%.2f", balance);
    }

    

}
