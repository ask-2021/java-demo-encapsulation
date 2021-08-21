package overriding;

public class ChromeDriver extends WebDriver {

    public void click() {
        System.out.println("Performing Click - Chrome");
    }

    public void sendKeys(){
        System.out.println("Typing in an Element - Chrome");
    }
}
