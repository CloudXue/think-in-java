package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice3 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2("test");
        System.out.println(outer.getInner());
    }
}

class Outer2 {
    private String data;

    public Outer2(String data){
        this.data = data;
    }
    class Inner {
        @Override
        public String toString() {
            return data;
        }
    }
    Inner getInner(){
        return new Inner();
    }
}
