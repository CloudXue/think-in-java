package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice13 {
    public static void main(String[] args) {
        OverloadChild overloadChild = new OverloadChild();
        overloadChild.load();
        overloadChild.load(1);
        overloadChild.load(2d);
        overloadChild.load("s");
    }
}

class Overload{

    public void load(){
        System.out.println("load()");
    }
    public void load(int i){
        System.out.println("load(int)");
    }
    public void load(double d){
        System.out.println("load(double)");
    }
}

class OverloadChild extends Overload{
    public void load(String s){
        System.out.println("load(String)");
    }
}
