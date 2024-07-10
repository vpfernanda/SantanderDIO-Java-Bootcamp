package apps;

public class Phone implements App {
    private boolean isOpen = false; 
    private final String NAME_APP="Phone";

    public void dial(String number){
        if(isOpen)
            System.out.println("Discando para "+number);
    }

    public void InstallApp(){
        System.out.println("Installing "+NAME_APP+".");
        OpenApp();
    }

    public void OpenApp(){
        System.out.println(NAME_APP+" is open.");
        isOpen = !isOpen;
    }

    public void closeApp(){
        if(isOpen){
            System.out.println(NAME_APP+" was closed.");
            isOpen = !isOpen;
        }
    }

    public void DeleteApp(){
        isOpen = false;
        System.out.println(NAME_APP+" was deleted.");
    };
    

}
