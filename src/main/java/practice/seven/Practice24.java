package practice.seven;

import reusing.Beetle;

import static net.mindview.util.Print.print;

/**
 * Created by 95 on 2018/1/2.
 */
public class Practice24 extends Beetle{
    private int l = printInit("Practice24.l initialized");
    public Practice24() {
        print("l = " + l);
    }
    private static int x3 =
            printInit("static Practice24.x3 initialized");

    public static void main(String[] args) {
        new Practice24();
    }
}
