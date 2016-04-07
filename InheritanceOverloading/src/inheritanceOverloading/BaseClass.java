package inheritanceOverloading;

/**
 * Created by psok on 2/22/2016.
 */
public class BaseClass {
    public int meth(int a) {
        System.out.println("meth(int)");
        return  a * a;
    }
    public void meth(String str) {
        System.out.println("meth(String)");
    }
}
