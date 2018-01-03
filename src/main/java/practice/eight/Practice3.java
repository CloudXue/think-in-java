package practice.eight;

/**
 * 1.给基类增加了一个msg()方法，若导出类中都不实现该方法，则调用基类的该方法,若导出类覆盖了该方法，则调用导出类的该方法
 */
public class Practice3 {
    public static void main(String[] args) {
        Shapeb s1 = new Circleb();
        Shapeb s2 = new Squareb();

        s1.msg();
        s2.msg();
    }
}

class Shapeb {
    void draw() {
    }

    void erase() {
    }

    void msg() {
        System.out.println("default msg");
    }
}

class Circleb extends Shapeb {
    @Override
    void draw() {
        super.draw();
    }

    @Override
    void erase() {
        super.erase();
    }

    @Override
    void msg() {
        System.out.println("Circleb msg");
    }
}

class Squareb extends Shapeb {
    @Override
    void draw() {
        super.draw();
    }

    @Override
    void erase() {
        super.erase();
    }
}


