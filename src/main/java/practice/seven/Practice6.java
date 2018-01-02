package practice.seven;

/**
 * 证明若基类中没有无参构造器，必须在导出类中调用基类的构造器，否则编译器将“抱怨”无法找到符合形式的构造器
 */
public class Practice6 {

}

class Game {
    //取消注释导出类Chess将报错
//    Game(int i){}
}

class Chess extends Game {
    Chess() {

    }
}
