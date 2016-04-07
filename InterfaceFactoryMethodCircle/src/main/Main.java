package main;

interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle getCycle();
}

class Bicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Bicycle.Ride()");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Tricycle.Ride()");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class Rider {
    static void ride(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.move();
    }
}

public class Main {

    public static void main(String[] args) {
        Rider.ride(new BicycleFactory());
        Rider.ride(new TricycleFactory());

    }
}
