package com.company;

/**
 * Created by psok on 2/19/2016.
 */
public class Clazz {
    static private int j;
    static private int i = 11 + j;

    static {
        System.out.println("Constructor");
        j = 22;
        //System.out.println(i);
    }

    public static int getI() {
        return i;
    }
}
