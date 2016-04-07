package com.company;

class Super {
    static String ID = "QBANK";
    static {
        System.out.print("In Super");
    }
}

class Sub extends Super{
    static {
        System.out.print("In Sub");
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
