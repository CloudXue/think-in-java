package practice.eight;

import polymorphism.shape.*;
import polymorphism.shape.Circle;
import polymorphism.shape.Shape;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice4 {
    public static void main(String[] args) {
        polymorphism.shape.Shape[] shapes = {new Circle(), new Square(), new Triangle(), new NewShape()};
        for(Shape s : shapes){
            s.draw();
            s.erase();
        }
    }
}


class NewShape extends polymorphism.shape.Shape {
    @Override
    public void draw() {
        System.out.println("NewShape.draw()");
    }

    @Override
    public void erase() {
        System.out.println("NewShape.erase()");
    }
}