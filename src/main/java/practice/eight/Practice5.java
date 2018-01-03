package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice5 {
    void ride(Cycleb c){
        c.ride();
    }
    public static void main(String[] args) {
        Practice5 p = new Practice5();
        p.ride(new Unicycleb());
        p.ride(new Bicycleb());
        p.ride(new Tricycleb());
    }
}

class Cycleb {
    void ride(){
        System.out.println("num of wheels: " + wheels());
    }
    int wheels(){
        return 0;
    }
}

class Unicycleb extends Cycleb {

    @Override
    int wheels() {
        return 1;
    }
}

class Bicycleb extends Cycleb {

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycleb extends Cycleb {

    @Override
    int wheels() {
        return 3;
    }
}