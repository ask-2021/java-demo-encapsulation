package overriding;

public class FirefoxDriver extends WebDriver {

    @Override
    public void click() {
        System.out.println("Performing Click - FireFox");
    }

    public void sendKeys(){
        System.out.println("Typing in an Element - FireFox");
    }

    public void whyPrint(String st){

        System.out.println("DO NOT CALL ME");
    }




}
