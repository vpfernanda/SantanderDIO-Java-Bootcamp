package app;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        //String path = "src/data/Banks.txt";
        Bank bank = new Bank("Itaú");
        BankList bList = new BankList();
        bList.addBankToTreeMap(bank);
        bList.addBankToTreeMap(new Bank("Inter"));
        bList.addBankToTreeMap(new Bank("Nubank"));
        bList.addBankToTreeMap(new Bank("Itaú"));

        //System.out.println(bList.toString());
        //bList.saveBanksToTxt("src/data/Banks.txt");

        Account ac = new CheckingAccount(5);
        System.out.println(ac.toString());
        Account ac2 = new SavingsAccount(1, 1.5);
        System.out.println(ac2.toString());



    }
}
