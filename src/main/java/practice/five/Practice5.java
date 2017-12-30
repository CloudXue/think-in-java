package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark(2d);
    }
}

class Dog{
    public void bark(int i){
        System.out.println("barking");
    }
    public void bark(double d){
        System.out.println("howling");
    }
}
