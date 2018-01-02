package practice.five;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice22 {
    public static void main(String[] args) {
        Practice22 p = new Practice22();
        p.test(Denomination.FIFTY);
    }

    public void test(Denomination d){
        switch (d){
            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case FIVE:
                System.out.println("5");
                break;
            case TEN:
                System.out.println("10");
                break;
            case TWENTY:
                System.out.println("20");
                break;
            case FIFTY:
                System.out.println("50");
                break;
            default:
                System.out.println("错误");
        }
    }
}
