package practice.five;

/**
 * 创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域。这两种方式有何差异？
 1.代码的可维护性

 　　类的成员变量在定义时初始化，那么每次创建这个类的对象时，该成员变量的值都是固定为此值；

    通过构造函数初始化，可以在创建该类对象时动态赋值，更加灵活。

 2.代码执行顺序

    在类被创建时，成员变量按照声明顺序初始化，然后调用类的构造方法。

 　　执行顺序:
    执行父类静态代码 执行子类静态代码
    初始化父类成员变量（我们常说的赋值语句）
    初始化父类构造函数
    初始化子类成员变量
    初始化子类构造函数
 */
public class Practice2 {
    public static void main(String[] args) {
        WithoutInitClass2 w = new WithoutInitClass2("test2");
    }
}
class WithoutInitClass2{
    String str = "test";

    public WithoutInitClass2(String str){
        System.out.println("构造函数运行前str的值为：" + this.str);
        this.str = str;
        System.out.println("构造函数运行后str的值为：" + this.str);
    }
}
