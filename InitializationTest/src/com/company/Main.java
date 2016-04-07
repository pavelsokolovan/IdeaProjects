package com.company;

class Base {
    public Base() {
        System.out.println(getName());
    }
    protected String getName() { return "Base";}
}

class Main extends Base {
    private String name = "Derived";
    @Override
    protected String getName() { return this.name;}
    public static void main(String[] args) {
        new Main();
    }
}
