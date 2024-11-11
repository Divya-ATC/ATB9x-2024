package Nov.Encapsulation2.Real;

public class TastCase1 extends BaseClass {

    TastCase1() {
        super();
        // Parent Constructor - Super - Means Parent
        // this - current Object
        System.out.println("DC - TC1");
    }

    public void startTestCase() {
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }


    @Override
    public String toString() {
        return "TestCase1{}";
    }

}