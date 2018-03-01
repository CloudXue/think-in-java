package practice.ten.tenexternal2;

import practice.ten.tenexternal.Practice6Interface;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice6Extenernal {
    protected class Inner implements Practice6Interface{
        public Inner(){}
        public void f() {
            System.out.println("Practice6Extenernal.f()");
        }
    }
}
