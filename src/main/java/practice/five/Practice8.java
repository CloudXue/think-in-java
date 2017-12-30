package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice8 {
    public void method2(){
        System.out.println("调用成功!");
    }

    public void method(){
        method2();
        this.method2();
    }

    public static void main(String[] args) {
        Practice8 p = new Practice8();
        p.method();
    }
}
