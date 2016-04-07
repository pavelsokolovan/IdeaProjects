package main;

class ParamTransfer {
    void Change(int i) {
        i = 2;
    }
    void Change(Obj obj) {
        //obj.id = 22;
        obj = new Obj(22);
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
        ParamTransfer paramTransfer = new ParamTransfer();

        int val1 = 1;
        System.out.println(val1);
        paramTransfer.Change(val1);
        System.out.println(val1);

        System.out.println();
        Obj obj1 = new Obj(1);
        System.out.println(obj1.id);
        paramTransfer.Change(obj1);
        System.out.println(obj1.id);
    }
}
