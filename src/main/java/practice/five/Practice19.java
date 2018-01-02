package practice.five;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice19 {
    public static void main(String[] args) {
        Practice19 p = new Practice19();
        p.test("a", "b", "c");
        p.test(new String[]{"a", "b", "c"});
    }

    public void test(String... strings) {
        for(String s : strings){
            System.out.println(s);
        }
    }
}
