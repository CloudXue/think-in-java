package practice.eight;

import static net.mindview.util.Print.print;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice2 {
}

class Shape {
    void draw() {
    }

    void erase() {
    }
}

//其他几个类就不一一实现了
class Circle extends Shape {
    @Override
    void draw() {
        print("Circle.draw()");
    }

    @Override
    void erase() {
        print("Circle.erase()");
    }
}
