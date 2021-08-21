package overriding;

public class StudentMathClass extends MyMathsClass{

    //add a functionality to check if two numbers are equal

    public boolean isNumberEquals(int a, int b){
//        if (a!=b){
//            return false;
//        }else
//            return true;

       int difference= diff(a, b);
       if(difference> 0){
           return false;
       }else
           return true;

    }


    // see which one is bigger

    public int returnBiggerNumber(int a, int b){

        make1FromTwoNumbers(a, b);
        if(a > b){
            return a;
        }else
            return b;

    }

    // given two inputs, how can you return 1 using maths

    public int make1FromTwoNumbers(int a, int b){

        int output= sum(a, b);
        return (a+b)/output;

    }


}
