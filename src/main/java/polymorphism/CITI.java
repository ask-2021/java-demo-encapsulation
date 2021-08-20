package polymorphism;

public class CITI extends RBI {

    //overriding
    public double getHomeLoanROI(){
        return 11.5;
    }


    public static void main(String[] args) {
        CITI citi = new CITI();

        System.out.println(citi.getHomeLoanROI());
    }
}
