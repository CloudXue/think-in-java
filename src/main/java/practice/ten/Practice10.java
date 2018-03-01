package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice10 {
    SimpleInterface f(){
        if(true){
            class Inner implements SimpleInterface{
                public void f() {
                    System.out.println("Practice10.f()");
                }
            }
            return new Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        Practice9 practice = new Practice9();
        SimpleInterface simpleInterface = practice.f();
        if(simpleInterface != null){
            simpleInterface.f();
        }
    }
}
