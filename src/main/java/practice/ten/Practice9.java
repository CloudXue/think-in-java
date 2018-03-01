package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice9 {
    SimpleInterface f(){
        class Inner implements SimpleInterface{
            public void f() {
                System.out.println("Practice9.f()");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        Practice9 practice = new Practice9();
        SimpleInterface simpleInterface = practice.f();
        simpleInterface.f();
    }
}

interface SimpleInterface{
    void f();
}
