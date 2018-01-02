package practice.five;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice21 {
    public static void main(String[] args) {
        for(Denomination d : Denomination.values()){
            System.out.println(d.ordinal());
        }
    }
}

enum Denomination{
    ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}
