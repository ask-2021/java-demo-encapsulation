package abstractClass;

public class FirefoxDriver extends WebDriver{

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void sendKeys() {
        System.out.println("Typing in an Element");
    }

    @Override
    public void getTitle() {
        System.out.println("Get Title");
    }

    @Override
    public void printMe(String str) {
        System.out.println(str);
    }
}
