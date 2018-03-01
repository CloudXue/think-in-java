package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice1 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner();
    }
}

class Outer {
    class Inner {

    }
    Inner getInner(){
        return new Inner();
    }
}
