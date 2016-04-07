package main;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChars {
    private static Random rand = new Random();

    private int count;
    boolean hasNext() {
        return count > 0;
    }

    private static final char[] charecters = "qwertyuiop[];lkjhgfdsazcvbnm,. ".toCharArray();

    RandomChars(int count) {
        this.count = count;
    }

    char next() {
        if (count-- == 0)
            return ' ';
        return  (charecters[rand.nextInt(charecters.length)]);
    }
}

class RandomCharsAdapter implements Readable {
    private RandomChars randomChars;

    RandomCharsAdapter(int count) {
        randomChars = new RandomChars(count);
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(randomChars.hasNext()) {
            cb.append(randomChars.next());
            return 1;
        }
        return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomCharsAdapter(5));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
