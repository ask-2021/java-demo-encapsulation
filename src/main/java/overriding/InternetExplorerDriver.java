package overriding;

public class InternetExplorerDriver extends WebDriver {

        public void click() {
            System.out.println("Performing Click - IE");
        }

        public void sendKeys(){
            System.out.println("Typing in an Element - IE");
        }
}

