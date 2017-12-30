package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice4 {
    public static void main(String[] args) {
        Construct2 c = new Construct2();
        Construct2 c2 = new Construct2("重载测试");
    }
}

class Construct2{
    public Construct2(){
        System.out.println("无参构造器");
    }
    public Construct2(String str){
        System.out.println("构造器重载：" + str);
    }
}
