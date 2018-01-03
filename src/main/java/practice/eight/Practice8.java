package practice.eight;

import java.util.Random;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice8 {
    private Random rand = new Random(47);
    Instrument next(){
        int i = rand.nextInt(6);
        switch (i){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Electronic();
        }
    }

    public static void main(String[] args) {
        Practice8 p = new Practice8();
        for(int i=0;i<10;i++){
            System.out.println(p.next());
        }
    }
}
