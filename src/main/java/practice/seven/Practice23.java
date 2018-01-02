package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice23 {
    public static void main(String[] args) {
        System.out.println("calling static member");
        System.out.println(LoadTest.i);
        System.out.println("new an object");
        new LoadTest();
    }
}

class LoadTest{
    static{
        System.out.println("loadTest");
    }

    static int i;
}
