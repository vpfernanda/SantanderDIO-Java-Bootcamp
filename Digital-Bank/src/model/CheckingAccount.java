package model;
public class CheckingAccount extends Account {

    private final String ACCOUNT_TYPE = "Checking";

    public CheckingAccount(Integer bankCode){
        super(bankCode);
    }
    
    public String toString(){
        return "Account type: "+ACCOUNT_TYPE+" "+super.toString();
    }
}
