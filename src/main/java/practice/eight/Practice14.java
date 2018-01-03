package practice.eight;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: xuesl
 * 开发时间: 2018/1/3<br>
 * <br>
 */
public class Practice14 {
    public static void main(String[] args) {
        SharedMember share = new SharedMember();
        Rodentc[] mouses = {new Mousec(share),new Mousec(share),new Mousec(share),new Mousec(share)};
        for(Rodentc r : mouses){
            r.dispose();
        }
    }
}

class Rodentc{
    private NonSharedMember ns1 = new NonSharedMember(1);
    private NonSharedMember ns2 = new NonSharedMember(2);
    private SharedMember share;
    Rodentc(SharedMember share){
        this.share = share;
        this.share.addRef();
        System.out.println("Rodentc");
    }
    void bite(){
        System.out.println("咬");
    }
    void dispose(){
        System.out.println("dispose " + this);
        share.dispose();
    }

    @Override
    public String toString() {
        return "Rodentc";
    }
}

class Mousec extends Rodentc{
    Mousec(SharedMember share){
        super(share);
        System.out.println("Mousec");
    }
    void bite(){
        System.out.println("老鼠咬");
    }

    void dispose(){
        System.out.println("dispose " + this);
        super.dispose();
    }

    @Override
    public String toString() {
        return "Mousec";
    }
}

class Gerbilc extends Rodentc{
    Gerbilc(SharedMember share){
        super(share);
        System.out.println("Gerbilc");
    }
    void bite(){
        System.out.println("鼹鼠咬");
    }
}

class Hamsterc extends Rodentc{
    Hamsterc(SharedMember share){
        super(share);
        System.out.println("Hamsterc");
    }
    void bite(){
        System.out.println("仓鼠咬");
    }
}

class SharedMember{
    private int refcount = 0;
    private static long counter;
    private final long id = ++counter;

    SharedMember(){
        System.out.println("create " + this);
    }

    void addRef(){
        refcount++;
    }

    void dispose(){
        if(--refcount == 0){
            System.out.println("dispose " + this);
        }
    }

    @Override
    public String toString() {
        return "SharedMember " + id;
    }
}

class NonSharedMember{
    NonSharedMember(int i){
        System.out.println("NonSharedMember " + i);
    }
}
