package apps;

public class Browser implements App {

    private boolean isOpen = false;
    private final String NAME_APP;

    public Browser(String name){
        NAME_APP = name;
    }

    public void newTab(String webSite){
        System.out.println("New tab: "+webSite);
    }

    public void checkConnection(){
        System.out.println("Connected.");
    }

    public void closeTab(){
        System.out.println("Close tab.");
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
