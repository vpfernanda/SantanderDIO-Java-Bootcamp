import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String cpf = "";
        System.out.println("Please, type your CPF (only numbers): ");
        cpf += scanner.next(); 
        try{
           CPFverify(cpf);
           System.out.println("You have a valid CPF.");
        }
        catch (InvalidCPFException exception){
            System.out.println("Your CPF is not valid.");
            //exception.printStackTrace();
        }
        finally{ 
            scanner.close();
        }
        
    }

    static void CPFverify (String cpf) throws InvalidCPFException{
        if(cpf.length()!=11){
            throw new InvalidCPFException();
        } 
        else if(!(firstDigitVerify(cpf)&&secondDigitVerify(cpf))) throw new InvalidCPFException();

        //return;
    }

    static boolean firstDigitVerify (String cpf){
        int counter=10;
        int sum=0;
        char charDigit = cpf.charAt(9);
        int numberInt;
        int digit = Character.getNumericValue(charDigit);

        for (int i = 0; i < 9; i++) {
            
            numberInt = Character.getNumericValue(cpf.charAt(i));
            sum += numberInt * counter;
            counter--;
        }

        int divisionRest = sum%11;
        int character10 = divisionRest<2 ? 0 : 11-divisionRest;
        
        
        return character10 == digit;
    }

    static boolean secondDigitVerify (String cpf){
        int counter=11;
        int sum=0;
        char charDigit = cpf.charAt(10);
        int numberInt;
        int digit = Character.getNumericValue(charDigit);

        for (int i = 0; i < 10; i++) {
            
            numberInt = Character.getNumericValue(cpf.charAt(i));
            sum += numberInt * counter;
            counter--;
        }

        int divisionRest = sum%11;
        int character11 = divisionRest<2 ? 0 : 11-divisionRest;
        
        return character11 == digit;

    }
}
