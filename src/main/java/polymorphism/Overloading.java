package polymorphism;

public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.doLogin("test1@abc.com", "pswd123");
        overloading.doLogin(123466789, "saga1234");

        overloading.add(1,2);
        overloading.add("abc", 3);
        overloading.add(10, "xyz");
        overloading.add();
        byte b1 = 10;
        byte b2 = 20;
        overloading.add(b1,b2);
    }

    public void doLogin(int mobileNumber, String password){
        System.out.println("Login successful using mobile number");
    }

    public void doLogin(String userId, String password){
        System.out.println("Login successful using user ID");
    }

    public void add(int a, int b){
//        StringBuilder sb = new StringBuilder();
//        sb.append(a);
//        sb.append(b);
//        System.out.println(sb);

 //       System.out.println(String.valueOf(a) + String.valueOf(b)); --> another way to print integer value instead of performing action

        System.out.println(a + " " + b);
    }

    public void add(byte a, byte b){
        System.out.println(a +" "+ b);
    }

    public void add(String s, int d){
        System.out.println(s + d);
    }

    public void add(int a, String s){
        System.out.println(a + s);
    }

    public void add(){
        System.out.println("No argument");
    }
}
