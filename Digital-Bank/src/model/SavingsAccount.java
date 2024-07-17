package model;

public class SavingsAccount extends Account{
    private final String ACCOUNT_TYPE = "Savings";
    private double yield = 0d;

    public SavingsAccount(Integer bankCode, double yield){
        super(bankCode);
        this.yield = yield;
    }

    public String toString(){
        return "Account type: "+ACCOUNT_TYPE+" "+super.toString()+"\nBalance Yield: "+yield;
    }
    
}
