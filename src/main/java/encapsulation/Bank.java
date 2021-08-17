package encapsulation;

public class Bank {

    int a;
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }

    double b;


    public int accountNo = 123456;
    private int pinNo = 1234;
    private double accountBalance = 1000000;

    public void withdrawAmount (int accNo, int pin, int amount){

        if(accNo == accountNo && pin == pinNo){
            if(amount<=accountBalance){
               accountBalance = accountBalance - amount;
                System.out.println("Amount withdrawal successful !!!");
                System.out.println("Account balance: " +accountBalance);
            } else{
                System.out.println("Insufficient Balance !!!");
            }
        }else{
            System.out.println("Invalid Credentials !!!");
        }

    }

    public void updatePin(int accNo, int oldPin, int newPin ){
        if(accNo == accountNo && oldPin == pinNo){
            pinNo = newPin;
            System.out.println("Pin changed successfully !!!");

        }else{
            System.out.println("Wrong Pin !!!");
        }

    }
}
