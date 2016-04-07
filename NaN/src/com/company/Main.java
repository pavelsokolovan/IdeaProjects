package com.company;

public class Main {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1111); //new Float(11);
        Integer i2 = Integer.valueOf(1111); //new Float(11);
        Float f1 = Float.valueOf(11f); //new Float(11);
        Float f2 = Float.valueOf(11f); //new Float(11);
        System.out.println(i1 == i2);
        //System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );
    }
}
