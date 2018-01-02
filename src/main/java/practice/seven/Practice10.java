package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice10 {
    public static void main(String[] args) {
        new Stemb(10);
    }
}

class Rootb {
    private Component1b c1 = new Component1b(1);
    private Component2b c2 = new Component2b(2);
    private Component3b c3 = new Component3b(3);

    Rootb(int i) {
        System.out.println("Rootb" + i);
    }
}

class Stemb extends Rootb {
    private Component1b c1 = new Component1b(1);
    private Component2b c2 = new Component2b(2);
    private Component3b c3 = new Component3b(3);

    Stemb(int i) {
        super(i);
        System.out.println("Stemb" + i);
    }
}

class Component1b {
    Component1b(int i) {
        System.out.println("Component1b" + i);
    }
}

class Component2b {
    Component2b(int i) {
        System.out.println("Component2b" + i);
    }
}

class Component3b {
    Component3b(int i) {
        System.out.println("Component3b" + i);
    }
}