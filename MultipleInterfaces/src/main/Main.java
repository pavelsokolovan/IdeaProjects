package main;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight(){}
}

class Hero extends ActionCharacter
implements CanFight, CanSwim, CanFly, CanClimb {
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
