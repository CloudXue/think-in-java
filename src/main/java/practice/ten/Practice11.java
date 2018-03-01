package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice11 {

    public static void main(String[] args) {
        Outer6 outer = new Outer6();
        SimpleInterface si = outer.get();
        si = outer.get2();
//不能编译
//        Inner i1 = (Inner)outer.get();
//        Inner i2 = outer.get2();
    }
}

class Outer6 {
    private class Inner implements SimpleInterface {

        public void f() {
            System.out.println("Outer6.Inner.f()");
        }
    }
    public SimpleInterface get(){
        return new Inner();
    }

    public Inner get2(){
        return new Inner();
    }
}


