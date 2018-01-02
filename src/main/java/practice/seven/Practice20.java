package practice.seven;

import static net.mindview.util.Print.print;

/**
 * 使用@Override注解后不能通过编译，可以看出，这里并没有发生重写，private修饰的方法并不处于基类的接口中，不能被重写
 */
public class Practice20 {
}

class WithFinals {
    // Identical to "private" alone:
    private final void f() { print("WithFinals.f()"); }
    // Also automatically "final":
    private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
//    @Override
    private final void f() {
        print("OverridingPrivate.f()");
    }
//    @Override
    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
//    @Override
    public final void f() {
        print("OverridingPrivate2.f()");
    }
//    @Override
    public void g() {
        print("OverridingPrivate2.g()");
    }
}
