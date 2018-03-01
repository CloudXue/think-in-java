package practice.ten;

import innerclasses.Selector;


/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/2/28<br>
 * <br>
 */
public class Practice4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Sequence.SequenceSelector selector = (Sequence.SequenceSelector) sequence.selector();
        Sequence sequence1 = selector.outer();
        System.out.println(sequence1 == sequence);
    }
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public class SequenceSelector implements Selector {
        private int i = 0;

        public Sequence outer(){
            return Sequence.this;
        }

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
