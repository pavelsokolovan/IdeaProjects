package main;

import Test.AbleToDo;
import Test.Sub;
import Test.Super;

public class Main {

    public static void main(String[] args) {
        AbleToDo stuff = new Sub();
        stuff.Do();
    }
}
