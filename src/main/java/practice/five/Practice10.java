package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice10 {
    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

    public static void main(String[] args) {
        new Practice10();
//        System.gc();
    }
}
