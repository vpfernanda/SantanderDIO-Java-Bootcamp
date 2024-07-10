public class iPhone {
    public static void main(String[] args) throws Exception {
        apps.iPod iPod = new apps.iPod();
        apps.Browser browser = new apps.Browser("Safari");
        apps.Phone phone = new apps.Phone();

        iPod.InstallApp();
        browser.InstallApp();
        phone.InstallApp();


        phone.dial("31998567456");
        phone.closeApp();

        browser.checkConnection();
        browser.newTab("facebook.com");
        browser.closeApp();

        iPod.setSong("Fear of the dark", "Iron Maiden");
        System.out.println(iPod.playSong());
        iPod.pauseSong();

    }
}
