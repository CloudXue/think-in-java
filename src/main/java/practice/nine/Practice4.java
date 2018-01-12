package practice.nine;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice4 {
    public static void test1(AbstractClassWithoutMethod a){
        ((ChildClass2)a).print();
    }
    public static void test2(AbstractClassWithMethod a){
        a.print();
    }

    public static void main(String[] args) {
        test1(new ChildClass2());
        test2(new ChildClass3());
    }
}

abstract class AbstractClassWithoutMethod{

}

class ChildClass2 extends AbstractClassWithoutMethod{
    void print(){
        System.out.println("ChildClass2");
    }
}

abstract class AbstractClassWithMethod{
    abstract void print();
}

class ChildClass3 extends AbstractClassWithMethod{

    void print() {
        System.out.println("ChildClass3");
    }
}


