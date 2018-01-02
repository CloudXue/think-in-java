package practice.seven;

import reusing.Detergent;

/**
 * 从Detergent中继承产生一个新的类。覆盖scrub()并添加一个名为sterilize()的新方法。
 */
public class Practice2 extends Detergent{
    @Override
    public void scrub() {
        System.out.println("Practice2.scrup()");
    }

    public void sterilize(){
        System.out.println("sterilize()");
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2();
        p.scrub();
        p.sterilize();
    }
}
