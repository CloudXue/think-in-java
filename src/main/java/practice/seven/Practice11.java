package practice.seven;

import static net.mindview.util.Print.print;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice11 {
}

class Cleanserb {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanserb x = new Cleanserb();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

class DetergentDelegation {
    private Cleanserb cleanserb = new Cleanserb();
    // Change a method:
    public void scrub() {

        System.out.println(" Detergent.scrub()");
        cleanserb.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() {
        System.out.println(" foam()");
    }
    // Test the new class:
    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanserb.main(args);
    }
}
