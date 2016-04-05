package access.coockie.abc;

/**
 * Created by Home on 20.02.2016.
 */
public class B extends A {
    B() {
        super(11);
        System.out.println("B()");
    }
    B(int i) {
        super(i);
        System.out.println("B(i) " + i);
    }
}
