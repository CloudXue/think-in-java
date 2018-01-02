package practice.seven;

/**
 * 创建一个简单的类。在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化这个对象。
 */
public class Practice1 {
    private DelayClass dc;

    @Override
    public String toString() {
        if(dc == null)
            dc = new DelayClass("test");
        return dc.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Practice1());
    }
}

class DelayClass{
    private String s;
    public DelayClass(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
