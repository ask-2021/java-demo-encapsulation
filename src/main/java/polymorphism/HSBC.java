package polymorphism;

public class HSBC extends RBI {

    //overriding
    public double getHomeLoanROI(){
        return 10.25;
    }

    public HSBC getObject(){
        HSBC obj = new HSBC();
        return obj;
    }

    public static void main(String[] args) {
        HSBC hsbc = new HSBC();
        System.out.println(hsbc.getHomeLoanROI());
        System.out.println(hsbc.getObject());
    }
}
