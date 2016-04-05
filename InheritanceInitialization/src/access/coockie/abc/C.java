package access.coockie.abc;

/**
 * Created by Home on 20.02.2016.
 */
public class C extends A {
    private B b = new B();
    private B bb;
    {
        bb = new B(3);
    }

    public C() {
        super(1);
        System.out.println("C()");
    }
}
