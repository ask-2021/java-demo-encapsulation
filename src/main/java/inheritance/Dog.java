package inheritance;

public class Dog extends Animal{

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog class");
        dog.generateSound();
    }

//    public void generateSound(){
//        System.out.println("Calling from Dog class");
//    }
}
