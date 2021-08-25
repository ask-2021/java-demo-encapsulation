package superKeyword;

public class DogClass extends AnimalClass{

    public DogClass(int x){
        System.out.println("Dog constructor");
    }

    @Override
    public void sound() {

        System.out.println("Dog class called");
        super.sound();
    }
}
