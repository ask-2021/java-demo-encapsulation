package inheritance;

public class Cat extends Animal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat class");
        cat.generateSound();
    }
}
