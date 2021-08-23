package interfacepack;

public class FirefoxDriver implements WebDriver {

    @Override
    public void click() {
        System.out.println("Clicking Firefox");
    }

    @Override
    public void sendKeys() {
        System.out.println("Typing in an element");

    }

}
