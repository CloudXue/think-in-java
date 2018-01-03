package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice12 {
    public static void main(String[] args) {
        new Mouseb();
    }
}

class Rodentb{
    private Description d = new Description(1);
    private Description2 d2 = new Description2(1);
    Rodentb(){
        System.out.println("Rodentb");
    }
    void bite(){
        System.out.println("咬");
    }
}

class Mouseb extends Rodentb{
    private Description d = new Description(2);
    private Description2 d2 = new Description2(2);
    Mouseb(){
        System.out.println("Mouseb");
    }
    void bite(){
        System.out.println("老鼠咬");
    }
}

class Gerbilb extends Rodentb{
    private Description d = new Description(3);
    private Description2 d2 = new Description2(3);
    Gerbilb(){
        System.out.println("Gerbilb");
    }
    void bite(){
        System.out.println("鼹鼠咬");
    }
}

class Hamsterb extends Rodentb{
    private Description d = new Description(4);
    private Description2 d2 = new Description2(4);
    Hamsterb(){
        System.out.println("Hamsterb");
    }
    void bite(){
        System.out.println("仓鼠咬");
    }
}

class Description{
    Description(int i){
        System.out.println("Description: " + i);
    }
}

class Description2{
    Description2(int i){
        System.out.println("Description2: " + i);
    }
}