import overriding.*;

public class TestCase extends Base {

    public static void main(String[] args) {

//        MyMathsClass myMathsClass = new MyMathsClass();
//
//        StudentMathClass studentMathClass = new StudentMathClass();
//        System.out.println(studentMathClass.sum(2,4));
//        System.out.println(studentMathClass.diff(4,7));
//        System.out.println(studentMathClass.isNumberEquals(5,5));
//        System.out.println(studentMathClass.returnBiggerNumber(71,17));
//        System.out.println(studentMathClass.make1FromTwoNumbers(9,1));

//        FirefoxDriver firefoxDriver= new FirefoxDriver();
//        firefoxDriver.click();
//        firefoxDriver.printMe("How are you");
//        firefoxDriver.whyPrint("print me please");
//
//        ChromeDriver chromeDriver= new ChromeDriver();
//        chromeDriver.click();
//        chromeDriver.printMe("I am fine");

        TestCase testCase = new TestCase();
        testCase.initiateBrowser();

    }

    String browserName = " ";

    public void initiateBrowser(){
        WebDriver driver = getBrowserInstance(browserName);
        driver.click();
        driver.getTitle();
        driver.printMe("Hello World");
        driver.sendKeys();
    }
}
