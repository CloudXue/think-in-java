package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice10 {
    public static void main(String[] args) {
        Father f = new Child();
        f.first();
    }
}

class Father{
    void first(){
        second();
    }

    void second(){

    }
}

class Child extends Father{
    @Override
    void second() {
        System.out.println("child");
    }
}
