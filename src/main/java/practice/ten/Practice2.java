package practice.ten;

import innerclasses.Selector;
import innerclasses.Sequence;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i=0;i<10;i++){
            sequence.add(new StringHolder(String.valueOf(i)));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class StringHolder {
    private String data;
    StringHolder(String data){
        this.data = data;
    }
    public String toString(){
        return data;
    }
}
