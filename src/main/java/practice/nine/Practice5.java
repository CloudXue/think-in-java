package practice.nine;

import practice.nineexternal.Practice5Interface;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice5{
    public static void main(String[] args) {
        Implement im = new Implement();
        im.print1();
        im.print2();
        im.print3();
    }
}

class Implement implements Practice5Interface{
    public void print1() {
        System.out.println(1);
    }

    public void print2() {
        System.out.println(2);
    }

    public void print3() {
        System.out.println(3);
    }
}
