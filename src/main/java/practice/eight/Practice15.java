package practice.eight;

import static net.mindview.util.Print.print;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice15 {
    public static void main(String[] args) {
        Glyph g = new RectangularGlyph(1,1,2,2);
        g.draw();
    }
}

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}



class RectangularGlyph extends Glyph{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    RectangularGlyph(int x1,int y1,int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.println("draw RectangularGlyph (x1,y1):("+x1+","+y1+") (x2,y2):("+x2+","+y2+")" );
    }
}