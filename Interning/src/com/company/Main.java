package com.company;

import other.*;
import java.util.Scanner;

class Other {
    static String hello = "Hello";
}

class X {
    <X> X(X x) {
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        //new Scanner(System.in).nextLine();
        String hello = "Hello", lo = "lo";
        System.out.print((com.company.Other.hello == hello) + " "); // true
        System.out.print((other.Other.hello == hello) + " ");       // true
        System.out.print((hello == ("Hel"+"lo")) + " ");            // true
        System.out.print((hello == ("Hel"+lo)) + " ");              // false
        System.out.println(hello == ("Hel"+lo).intern());           // true

        doIt();

        X x = new X(new Object());
    }

    public static void doIt() { //1
        i:
        for (int i = 0 ; i< 10; i++) {
            for (int j = 0; j< 10; j++) {
                if ( j+i > 10) {
                    continue;
                }
                System.out.println( i + ", " + j);
            }
        }
    }
}
