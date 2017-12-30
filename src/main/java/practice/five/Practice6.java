package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice6 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.bark(1,2d);
        d.bark(2d,1);
    }
}

class Dog2{
    public void bark(int i,double d){
        System.out.println("barking");
    }
    public void bark(double d,int i){
        System.out.println("howling");
    }
}
