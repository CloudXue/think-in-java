package practice.nine;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/12<br>
 * <br>
 */
public class Practice9 {
}

abstract class Instrument2 {
    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:
    void play(Note n){
        print(this + ".play() " + n);
    }; // Automatically public
    abstract void adjust();
}

class Wind extends Instrument2 {
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion extends Instrument2 {
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed extends Instrument2 {
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument2 i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument2[] e) {
        for(Instrument2 i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument2[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}