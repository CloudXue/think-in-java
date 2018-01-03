package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice1 {
    public void ride(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.ride(new Cycle());
        p.ride(new Unicycle());
        p.ride(new Bicycle());
        p.ride(new Tricycle());
    }

}

class Cycle {
    void ride() {
        System.out.println("Cycle ride");
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Unicycle ride");
    }
    void balance(){}
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Bicycle ride");
    }
    void balance(){}
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Tricycle ride");
    }
}