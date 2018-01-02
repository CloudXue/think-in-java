package practice.seven;

/**
 * 创建一个基类，它仅有一个非默认构造器；再创建一个导出类，它带有默认构造器和非默认构造器。在导出类的构造器中调用基类的构造器。
 */
public class Practice8 extends Base {
    public Practice8() {
        super(1);
        System.out.println("Practice8()");
    }

    public Practice8(int i) {
        super(i);
        System.out.println("Practice8(int)");
    }

    public static void main(String[] args) {
        new Practice8();
        new Practice8(5);
    }
}

class Base {
    Base(int i) {
        System.out.println("Base(int)" + i);
    }
}
