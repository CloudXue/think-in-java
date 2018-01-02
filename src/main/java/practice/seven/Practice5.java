package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice5 {
    public static void main(String[] args) {
        new C();
    }
}

class A {
    public A() {
        System.out.println("A()");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }
}

class C extends A {
    private B b = new B();
}
