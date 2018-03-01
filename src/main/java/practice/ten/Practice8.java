package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice8 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        outer.print();
    }
}

class Outer5 {
    public void print(){
        System.out.println(new Inner("aa").data);
        new Inner("bb").print();
    }
    class Inner {
        private String data;
        Inner(String data){
            this.data = data;
        }
        private void print(){
            System.out.println(data);
        }
    }
}
