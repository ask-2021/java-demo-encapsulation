package constructors;

public class Students {

    String studentName;
    int rollNo;

    public Students(){
        this("Kuhu",23);    // construction chaining means calling constructor within constructor using keyword "this"
        System.out.println("Constructor calling");

    }

    //construction overloading
    public Students(String studentName, int rollNo){
        //this();    //construction chaining
        this.studentName = studentName;
        this.rollNo = rollNo;

    }

    public static void main(String[] args) {

        Students st = new Students();
        System.out.println(st.rollNo);
        System.out.println(st.studentName);
        Students st1 = new Students("Abhay", 12 );
        System.out.println(st1.rollNo);
        System.out.println(st1.studentName);
    }
}
