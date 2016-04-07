package main;

import inheritanceOverloading.DrivenClass;

public class Main {

    public static void main(String[] args) {
        DrivenClass drivenClass = new DrivenClass();
        drivenClass.meth(3.3333);
        drivenClass.meth("3.3333");
        drivenClass.meth(333);
    }
}
