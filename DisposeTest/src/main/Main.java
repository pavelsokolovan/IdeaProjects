package main;

import dispose.Stem;

public class Main {

    public static void main(String[] args) {
        Stem stem = new Stem();
        try {
            System.out.println(stem.getComponent1());
        }
        finally {
            stem.dispose();
        }
    }
}
