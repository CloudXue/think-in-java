package practice.seven;

/**
 * 成员的销毁要在对象实例销毁后进行，基类的销毁要放最后
 */
public class Practice12 {
    public static void main(String[] args) {
        Stemc s = new Stemc();
        try{

        }finally {
            s.dispose();
        }
    }

}

class Rootc {
    private Component1c c1 = new Component1c();
    private Component2c c2 = new Component2c();
    private Component3c c3 = new Component3c();

    Rootc() {
        System.out.println("Rootc");
    }

    public void dispose() {
        System.out.println("Rootc dispose");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
}

class Stemc extends Rootc {
    private Component1c c1 = new Component1c();
    private Component2c c2 = new Component2c();
    private Component3c c3 = new Component3c();

    Stemc() {
        System.out.println("Stemc");
    }

    public void dispose() {
        System.out.println("Stemc dispose");
        c1.dispose();
        c2.dispose();
        c3.dispose();
        super.dispose();
    }
}

class Component1c {
    Component1c() {
        System.out.println("Component1c");
    }

    public void dispose() {
        System.out.println("Component1c dispose");
    }
}

class Component2c {
    Component2c() {
        System.out.println("Component2c");
    }

    public void dispose() {
        System.out.println("Component2c dispose");
    }
}

class Component3c {
    Component3c() {
        System.out.println("Component3c");
    }

    public void dispose() {
        System.out.println("Component3c dispose");
    }
}
