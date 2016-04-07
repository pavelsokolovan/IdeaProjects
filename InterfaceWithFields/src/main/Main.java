package main;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

interface A {
    int a = 11;
}

class RandomWord implements Readable {
    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
