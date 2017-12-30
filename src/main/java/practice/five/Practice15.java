package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice15 {
    String str;
    {
        str = "非静态初始化";
    }
    public Practice15(){
        System.out.println("无参构造器：" + str);
    }

    public Practice15(int i){
        System.out.println("有参构造器：" + str);
    }

    public static void main(String[] args) {
        new Practice15();
        new Practice15(1);
    }
}
