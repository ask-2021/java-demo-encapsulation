package polymorphism;

public class HSBC extends RBI {

    //overriding
    public double getHomeLoanROI(){
        return 10.25;
    }

//    public HSBC getObject(){
//        HSBC obj = new HSBC();
//        return obj;
//    }

    public AMEX getObject(){
        AMEX obj = new AMEX();
        return obj;
    }


//    public Object getObject(){
//        AMEX obj = new AMEX();
//        return "I am good";
//    }

    public static void main(String[] args) {
        HSBC hsbc = new HSBC();
        System.out.println(hsbc.getHomeLoanROI());
        System.out.println(hsbc.getObject());
    }
}
