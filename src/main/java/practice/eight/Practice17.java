package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice17 {
    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
//        cycles[0].balance();
//        cycles[1].balance();
//        cycles[2].balance();
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[0]).balance();
        //会抛类型转换异常
        ((Unicycle)cycles[0]).balance();
    }
}

