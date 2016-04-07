package dispose;

/**
 * Created by psok on 2/22/2016.
 */
public class Root {
    public Root() {
        component1 = new Component1();
        component2 = new Component2();
        System.out.println("Root Constructor");
    }

    public void dispose() {
        component2.dispose();
        component1.dispose();
        System.out.println("Root Dispose");
    }

    public Component1 getComponent1() {
        return component1;
    }

    public Component2 getComponent2() {
        return component2;
    }

    protected Component1 component1;
    protected Component2 component2;
}
