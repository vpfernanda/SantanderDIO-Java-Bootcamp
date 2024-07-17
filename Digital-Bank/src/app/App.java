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
        Account ac2 = new SavingsAccount(1, 1.5);
        ac.deposit(1200);
        ac.transfer(ac2, 500);
        System.out.println(ac2.toString());
        System.out.println(ac.toString());
        ac2.deposit(100);
        System.out.println(ac2.toString());
       




    }
}
