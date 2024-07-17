
package model;
public class Bank {
    private String bankName;

    public Bank(Integer bankCode) {
        BankList bl = new BankList("src/data/Banks.txt");
        if(bankCode<=bl.getMapSize()){
            this.bankName = bl.getBankByKey(bankCode).getBankName();
        }
        else
            this.bankName = "undefined";
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    

}
