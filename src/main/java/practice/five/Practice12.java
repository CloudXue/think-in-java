package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice12 {
    public static void main(String[] args) {
        //不能写成 Tank t = new Tank();
        //调用gc()时不代表必定被回收
        new Tank().cleanup();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}

class Tank {
    static int counter;
    private boolean full;
    private int id = counter++;

    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }

    public void cleanup(){
        full = false;
    }

    @Override
    protected void finalize() {
        if (full) {
            System.out.println("Error: tank " + id + " must be cleanup");
        }else{
            System.out.println("tank " + id + " is OK");
        }
    }
}
