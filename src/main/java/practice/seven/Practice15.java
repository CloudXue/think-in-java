package practice.seven;

import practice.sevenexternal.Practice15External;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/2<br>
 * <br>
 */
public class Practice15{
    public static void main(String[] args) {
        Practice15Test p = new Practice15Test();
        p.test2();
        //new Practice15External().test();
    }
}

class Practice15Test extends Practice15External{
    public void test2(){
        test();
    }
}

