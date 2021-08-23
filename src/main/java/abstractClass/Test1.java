package abstractClass;

public class Test1 {

    public static void main(String[] args) {

        //WebDriver webDriver = new FirefoxDriver();

        //new WebDriver(); --> cannot instantiate abstract class
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.click();
        firefoxDriver.getTitle();
        firefoxDriver.sendKeys();
        firefoxDriver.printMe("How are you?");
        firefoxDriver.captureScreenshot();
    }
}
