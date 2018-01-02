package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice17 {
    public static void main(String[] args) {
        Amphibian a = new Frogb();
        a.moveOnLand();
        a.moveInWater();
    }
}


class Frogb extends Amphibian{
    @Override
    public void moveInWater() {
        System.out.println("frog move in water");
    }

    @Override
    public void moveOnLand() {
        System.out.println("frog move on land");
    }
}