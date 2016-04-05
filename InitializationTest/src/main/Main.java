package main;

class Init {
    int a = 1;
    {
        System.out.println("a = " + a);
        a = 11;
    }
    Init() {
        System.out.println("a = " + a);
        a *= 2;
        System.out.println("a = " + a);
        System.out.println("Init()");
    }

    static int b = 444;
    static {
        System.out.println("b = " + b);
        b = 555;
        System.out.println("b = " + b);
    }

    static void meth() {
        System.out.println("meth()");
    }
    static void methStat() {
        System.out.println("Init.methStat()");
    }
}

class InitDriven extends Init {
    static int c = 4444;
    static void methStat() {
        System.out.println("InitDriven.methStat()");
    }
}

public class Main {

    public static void main(String[] args) {
        //System.out.println(Init.b);
        //Init.meth();
        Init initialization = new Init();
        System.out.println(InitDriven.c);
        InitDriven.methStat();
    }
}
