package main;

interface IFly {
    void flyMeth1();
    void flyMeth2();
}

interface IRun {
    void runMeth1();
    void runMeth2();
}

interface ISwim {
    void swimMeth1();
    void swimMeth2();
}

interface ISuper extends IFly, IRun, ISwim {
    void shoot();
}

abstract class Human {}

class SuperMan extends Human
implements ISuper {
    @Override
    public void shoot() {

    }

    @Override
    public void flyMeth1() {

    }

    @Override
    public void flyMeth2() {

    }

    @Override
    public void runMeth1() {

    }

    @Override
    public void runMeth2() {

    }

    @Override
    public void swimMeth1() {

    }

    @Override
    public void swimMeth2() {

    }
}



public class Main {
    public static void a(IFly arg){
        arg.flyMeth1();
        arg.flyMeth2();
    }
    public static void a(IRun arg){
        arg.runMeth1();
        arg.runMeth2();
    }
    public static void a(ISwim arg){
        arg.swimMeth1();
        arg.swimMeth2();
    }
    public static void a(ISuper arg){
        arg.flyMeth1();
        arg.flyMeth2();
        arg.runMeth1();
        arg.runMeth2();
        arg.swimMeth1();
        arg.swimMeth2();
        arg.shoot();
    }
    public static void a(SuperMan arg){
        arg.flyMeth1();
        arg.flyMeth2();
        arg.runMeth1();
        arg.runMeth2();
        arg.swimMeth1();
        arg.swimMeth2();
        arg.shoot();
    }
    public static void main(String[] args) {
	// write your code here
    }
}
