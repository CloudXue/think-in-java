package practice.nine;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice11 {
    public static void main(String[] args) {
        Apply.process(new CharacterPairSwapperAdapter(), "test");
    }
}

class CharacterPairSwapper{
    static String process(String input){
        StringBuilder sb = new StringBuilder(input);
        for(int i=0;i<sb.length()-1;i += 2){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            sb.setCharAt(i, b);
            sb.setCharAt(i+1,a);
        }
        return sb.toString();
    }
}

class CharacterPairSwapperAdapter implements Processor{

    public String name() {
        return CharacterPairSwapper.class.getName();
    }

    public Object process(Object input) {
        return CharacterPairSwapper.process((String)input);
    }
}
