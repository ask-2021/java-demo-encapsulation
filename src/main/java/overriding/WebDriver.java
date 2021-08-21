package overriding;

public class WebDriver {

    public void click(){
        System.out.println("Performing Click - WebDriver");
    }

    public void sendKeys(){
        System.out.println("Typing in an Element - WebDriver");
    }

    public void getTitle(){
        System.out.println("Getting the Title - WebDriver");
    }

    public void printMe(String str){

        System.out.println(str);
    }
}
