package p1;

import p1.A;

/**
 * Created by psok on 2/18/2016.
 */
public class B extends A {
    public void process(A a) {
        //i *= 2;
        a.i = a.i*2;
    }
}