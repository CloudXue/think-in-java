package practice.five;

/**
 *     问：创建一个类，它包含一个未初始化的String引用。验证该引用被Java初始化成了null。
 */
public class Practice1 {
    public static void main(String[] args) {
        WithoutInitClass w = new WithoutInitClass();
        System.out.println(w.getStr());
    }
}
class WithoutInitClass{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
