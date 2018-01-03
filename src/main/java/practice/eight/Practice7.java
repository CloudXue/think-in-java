package practice.eight;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice7 {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Electronic()
        };
        for(Instrument i : instruments){
            i.play(Note.MIDDLE_C);
            i.adjust();
            print(i);
        }
    }
}

class Electronic extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }

    @Override
    public String toString() {
        return "Electronic";
    }
}
