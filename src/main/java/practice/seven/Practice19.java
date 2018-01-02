package practice.seven;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice19 {
    private final FinalClass f;

    public Practice19(){
        f = new FinalClass();
    }

    public void setF(){
        //无法编译通过，final 修饰的对象不能改变引用
//        f = new FinalClass();
    }
}

class FinalClass{

}
