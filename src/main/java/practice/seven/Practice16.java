package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice16 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.moveInWater();
        amphibian.moveOnLand();
    }
}

class Amphibian{
    public void moveOnLand(){
        System.out.println("move on land");
    }

    public void moveInWater(){
        System.out.println("move in water");
    }
}

class Frog extends Amphibian{

}
