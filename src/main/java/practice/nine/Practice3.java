package practice.nine;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice3 {
    public static void main(String[] args) {
        new ChildClass().print();
    }
}

abstract class AbstractClass{
    abstract void print();

    AbstractClass(){
        print();
    }
}

class ChildClass extends AbstractClass{

    private int i = 10;

    void print() {
        System.out.println(i);
    }
}
