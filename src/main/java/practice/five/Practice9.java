package practice.five;

/**
 * Created by 95 on 2017/12/30.
 */
public class Practice9 {
    private int i;
    public Practice9(){
        this(5);
        System.out.println(this.i);
    }
    public Practice9(int i){
        this.i = i;
    }

    public static void main(String[] args) {
        Practice9 p = new Practice9();
    }
}
