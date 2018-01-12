package practice.nine;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice1 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent r : rodents){
            r.bite();
        }
    }
}

abstract class Rodent{
    abstract void bite();
}

class Mouse extends Rodent {
    void bite(){
        System.out.println("老鼠咬");
    }
}

class Gerbil extends Rodent {
    void bite(){
        System.out.println("鼹鼠咬");
    }
}

class Hamster extends Rodent {
    void bite(){
        System.out.println("仓鼠咬");
    }
}