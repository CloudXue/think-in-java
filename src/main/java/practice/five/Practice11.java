package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice11 {

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

    public static void main(String[] args) {
        //不能写成 Practice11 p = new Practice11();
        //调用gc()时不代表必定被回收
        new Practice11();
        System.gc();
        System.runFinalization();
    }
}
