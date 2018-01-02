package practice.seven;

/**
 *
 */
public class Practice9 {
    public static void main(String[] args) {
        new Stem();
    }

}

class Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    Root() {
        System.out.println("Root");
    }
}

class Stem extends Root {
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    Stem() {
        System.out.println("Stem");
    }
}

class Component1 {
    Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3");
    }
}
