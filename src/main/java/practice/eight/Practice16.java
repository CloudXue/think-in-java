package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice16 {
    public static void main(String[] args) {
        Starship s = new Starship();
        s.getColor();
        s.changeColor(new Green());
        s.getColor();
    }
}

class Starship{
    private AlertStatus as = new Red();
    public void changeColor(AlertStatus as){
        this.as = as;
    }
    public void getColor(){
        as.color();
    }

}

class AlertStatus{
    void color(){}
}

class Red extends AlertStatus{
    @Override
    void color() {
        System.out.println("skin is read");
    }
}

class Yellow extends AlertStatus{
    @Override
    void color() {
        System.out.println("skin is yellow");
    }
}

class Green extends AlertStatus{
    @Override
    void color() {
        System.out.println("skin is green");
    }
}
