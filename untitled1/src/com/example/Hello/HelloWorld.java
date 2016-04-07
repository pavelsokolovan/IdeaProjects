package com.example.Hello;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.concurrent.SynchronousQueue;

class Clazz {
    static int count;
    public static int amount;
    int a;
    char ch;

    Clazz() {
    }
    Clazz(int a) {
        this.a = a;
        if ( a % (amount / 10) == 0)
            System.out.println("Creation: " + a);
    }
    Clazz(char ch) {
        this.ch = ch;
    }
    Clazz(int a, char ch) {
        this(a);
        System.out.printf("");
    }

    private void Meth(){
        System.out.println("Meth");
    }

    static void MethStat(Clazz clazz){
        System.out.println("MethStat");
        clazz.Meth();
    }

    public void finalize() throws Throwable {
        System.out.println("Finalize: " + a);
        if ( a % (amount / 100) == 0)
            System.out.println("Finalize: " + a);
        super.finalize();
    }
}

public class HelloWorld {
    public static void main(String[] args) throws Throwable {
        int amount = 10;
        Clazz.amount = amount;
        for (int i = 0; i < amount; i++) {
            new Clazz(i);
        }
        System.out.println("END of creation");
        System.gc();
        for(;;);
    }
}
