package practice.seven;

/**
 * static只能初始化一次，所有实例拥有同一个
 */
public class Practice18 {
    static final SelfCounter s1 = new SelfCounter();
    final SelfCounter s2 = new SelfCounter();

    public static void main(String[] args) {
        System.out.println("first");
        System.out.println(new Practice18());
        System.out.println("second");
        System.out.println(new Practice18());
    }

    @Override
    public String toString() {
        return "s1 " + s1 + " s2 " + s2;
    }
}

class SelfCounter{
    private static int count;
    private int id = count++;

    @Override
    public String toString() {
        return "SelfCounter " + id;
    }
}
