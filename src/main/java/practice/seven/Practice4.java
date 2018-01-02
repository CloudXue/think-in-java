package practice.seven;

/**
 * 证明基类的构造器1.总是会被调用；2.在导出类构造器之前被调用
 */
public class Practice4 {
    public static void main(String[] args) {
        new Base2();
    }
}

class Base1 {
    public Base1() {
        System.out.println("Base1");
    }
}

class Base2 extends Base1 {
    public Base2() {
        System.out.println("Base2");
    }
}
