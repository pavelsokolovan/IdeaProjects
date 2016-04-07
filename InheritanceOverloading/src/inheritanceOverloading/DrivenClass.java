package inheritanceOverloading;

/**
 * Created by psok on 2/22/2016.
 */
public class DrivenClass extends BaseClass {
    public double meth(double d) {
        System.out.println("meth(double)");
        return d / 3.1415;
    }
}
