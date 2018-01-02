package practice.seven;

import reusing.Cartoon;

/**
 * 证明构建过程是从基类“向外”扩散的，所以基类在导出类构造器可以访问它之前，就已经完成了初始化。
 * 即使你不为导出类创建构造器，编译器也会为你合成一个默认的构造器，该构造器将调用基类的构造器
 */
public class Practice3 extends Cartoon {
    public static void main(String[] args) {
        new Practice3();
    }
}
