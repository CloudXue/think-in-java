package practice.nine;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice2 {
    public static void main(String[] args) {
        //不能通过编译
//        new AbstractClassWithoutAbstractMethod();
    }
}

abstract class AbstractClassWithoutAbstractMethod{
    void test(){
        System.out.println("test");
    }
}
