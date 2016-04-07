package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println(  new SimpleDateFormat("ddHHmmssSSS").format(new Date())  );
    }
}
