package main;
import instruments.TestDriven;
import instruments.*;
import somePack.*;

public class Main {

    public static void main(String[] args) {
        Instrument instr = new Wind();
        System.out.println(instr.getA());

        Test test = new TestDriven2();
        System.out.println(test);
    }
}
