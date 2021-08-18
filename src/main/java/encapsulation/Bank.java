package encapsulation;

public class Bank {

    public int getAccountNo() {
        return accountNo;
    }

    public int accountNo = 123456;

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    private int pinNo = 1234;

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    private double balanceAmount = 1000000;

    public void withdrawAmount (int accNo, int pin, double amount){

        if(accNo == accountNo && pin == pinNo){
            if(amount<=balanceAmount){
                balanceAmount = balanceAmount - amount;
                System.out.println("Amount withdrawal successful !!!");
                System.out.println("Account balance: " +balanceAmount);
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

    public double cashDeposit(int accNo , int pin , double amount){

        if(accNo == accountNo && pin == pinNo){
            balanceAmount = balanceAmount + amount;


        } else{
            System.out.println("Invalid Credentials !!!");

        }
        return balanceAmount;
    }
}
