package p2;

import p1.A;
import p1.B;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println( a.getI() );
    }
}
