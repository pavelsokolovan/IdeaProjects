package main;

interface IBase {
    void methBase();
}

interface IDriven1 extends IBase{
    void methDriven1();
}

interface IDriven2 extends IBase{
    void methDriven2();
}

interface IDrivenDriven extends IDriven1, IDriven2{
    void methDrivenDriven();
}

class Clazz implements IDrivenDriven{
    @Override
    public void methDrivenDriven() {

    }

    @Override
    public void methDriven1() {

    }

    @Override
    public void methDriven2() {

    }

    @Override
    public void methBase() {

    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
