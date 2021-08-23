package abstractClass;

public abstract class WebDriver {

    public abstract void click();

    public abstract void sendKeys();

    public abstract void getTitle();

    public abstract void printMe(String str);

    public void captureScreenshot(){
        System.out.println("SS captured");
    }
}
