import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String agency = "";
        String name = "";

        System.out.print("Please, type the agency number: ");
        agency += scanner.nextLine();
        System.out.print("Please, type your full name: ");
        name += scanner.nextLine();
        scanner.close();
        ContaTerminal conta = new ContaTerminal(agency, name);
        System.out.println(conta.toString());
        
    }
}
