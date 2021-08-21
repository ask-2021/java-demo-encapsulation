package overriding;

public class MyMathsClass {

    public int sum(int a, int b) {
        return (a + b);
    }

    public int diff(int a, int b) {

        if (a > b) {
            return a - b;


        } else {
            return b - a;
        }
    }
}
