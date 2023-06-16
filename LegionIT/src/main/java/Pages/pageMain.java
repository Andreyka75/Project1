package Pages;

public class pageMain {
    public static void main(String[] args) {
        page loginScreen = new page("Login", 1, "www.legionIT.com/login");
////        loginScreen.pageName="Login";
////        loginScreen.pageId=1;
////        loginScreen.URL="www.legionIT.com/login";
//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//        page aboutScreen=new page();
//        aboutScreen.setPageName("about");
////        aboutScreen.setPageId(2);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setURL("www.legionIT.com/about");
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();
//        loginPage loginpage = new loginPage();
//        loginpage.setPageName("loginPage");
//        loginpage.setURL("http/:...");
//
//
//        loginpage.setUsername("name");
//        loginpage.setPassword("123454322");
//        loginpage.populateCredentials();
//        loginpage.openPage();
        page page = new page();
        page.getDeveloperName();

        page loginPage = new loginPage();
        loginPage.getDeveloperName();

        page aboutPage = new aboutPage();
        aboutPage.getDeveloperName();


    }
}
