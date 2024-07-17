package model;
import java.util.Random;


public abstract class Account {

    public static int ACCOUNT_NUMBER = 1;
    protected String agency;
    protected String accountNumber;
    protected double balance;
    protected Bank bank;


    public Account(Integer bankCode) {
        agency = generateAgency(bankCode);
        accountNumber = generateAccountNumber();
        balance = 0d;
        this.bank = new Bank(bankCode);
    }

    public String getAgency() {
        return agency;
    }
 
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean withdraw(double value){
        if(value<balance)
            return false;
        
        balance -= value;
        return true;
    }

    public void deposit(double value){
        balance += value;
    }

    public boolean transfer(Account accountToTransfer, double value){
        if(this.withdraw(value)){
            accountToTransfer.deposit(value);
            return true;
        }
        return false;
    }

    private String generateAgency(Integer bankCode){
        Random r = new Random();
        int random = r.nextInt(9000)+1000;
        return random + "-" + bankCode;
    }

    private String generateAccountNumber(){
        ACCOUNT_NUMBER++;
        if(ACCOUNT_NUMBER<10)
            return "000"+ACCOUNT_NUMBER;
        if(ACCOUNT_NUMBER>=10 && ACCOUNT_NUMBER<100)
            return "00"+ACCOUNT_NUMBER;
        if(ACCOUNT_NUMBER>=100 && ACCOUNT_NUMBER<1000)
            return "0"+ACCOUNT_NUMBER;
        else
            return ""+ACCOUNT_NUMBER;  
    }

    @Override
    public String toString() {
        return "Account [agency=" + agency + ", accountNumber=" + accountNumber + ", balance="
                + balance + ", bank=" + bank.getBankName() + "]";
    }
    
    

}
