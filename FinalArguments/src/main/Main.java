package main;

class FinalArgs {
    void methWithFinal(final int i) {
        //i = 34;
        System.out.println(i);
    }
    void methWithFinal(final Obj obj) {
        obj.id = 22;
        //obj = new Obj(22);
    }
}

class Obj {
    int id;
    public Obj(int id) {
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        FinalArgs finalArgs = new FinalArgs();

        int a= 21;
        finalArgs.methWithFinal(a);
        System.out.println();

        Obj obj1 = new Obj(13);
        System.out.println(obj1.id);
        finalArgs.methWithFinal(obj1);
        System.out.println(obj1.id);
    }
}
