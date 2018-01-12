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
public class Practice10 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind3(),
                new Percussion3(),
                new Stringed3(),
                new Brass3(),
                new Woodwind3()
        };
        tuneAll(orchestra);
    }
}


interface Instrument3 {
    void adjust();
}

interface Playable{
    void play(Note n);
}

class Wind3 implements Playable,Instrument3 {
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }

    public void play(Note n) {
        print(this + ".play " + n);
    }
}

class Percussion3 implements Playable,Instrument3 {
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
    public void play(Note n) {
        print(this + ".play " + n);
    }
}

class Stringed3 implements Playable,Instrument3 {
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
    public void play(Note n) {
        print(this + ".play " + n);
    }
}

class Brass3 extends Wind3 {
    public String toString() { return "Brass"; }
}

class Woodwind3 extends Wind3 {
    public String toString() { return "Woodwind"; }
}


