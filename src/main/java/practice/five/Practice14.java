package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice14 {
    private static String str1 = "str1";
    private static String str2;

    static {
        str2 = "str2";
    }

    public static void print() {
        System.out.println("str1=" + str1 + ";str2=" + str2);
    }

    public static void main(String[] args) {
        Practice14.print();
    }
}
