package practice.ten;

import practice.ten.tenexternal.Practice6Interface;
import practice.ten.tenexternal2.Practice6Extenernal;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice6 extends Practice6Extenernal {
    public Practice6Interface inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Practice6 practice6 = new Practice6();
        practice6.inner().f();
    }
}
