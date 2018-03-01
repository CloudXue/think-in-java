package practice.ten;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice7 {
    public static void main(String[] args) {
        Outer4 outer = new Outer4("data");
        outer.test("changed");
    }
}

class Outer4 {
    private String data;
    Outer4(String data){
        this.data = data;
    }

    private String getData(){
        return data;
    }

    public void test(String data){
        new Inner().changeData(data);
    }

    class Inner {
        void changeData(String data){
            Outer4.this.data = data;
            System.out.println(getData());
        }
    }


}