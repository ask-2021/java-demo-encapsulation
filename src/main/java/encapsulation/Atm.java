package encapsulation;

public class Atm {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.updatePin(123456, 1234, 4567);
        bank.withdrawAmount(123456, 4567, 2000);
//        bank.accountBalance = 1000;
//        bank.withdrawAmount(123456, 1234, 100);

        System.out.println("The account balance is: " + bank.cashDeposit(123456, 4567, 10000));

        System.out.println("The account no is: " + bank.getAccountNo());

    }
}
