package main;

import java.util.Random;
import java.util.stream.Stream;

interface Game {
    void drop();
}

interface GameFabric {
    Game getGame();
}

/////////  CoinGame
class CoinGame implements Game {
    private final String[] coin = {"Eagle", "Tails"};
    private static Random random = new Random();

    @Override
    public void drop() {
        System.out.println("Coin is dropped: " + coin[random.nextInt(2)]);
    }
}

class CoinGameFabric implements GameFabric{
    @Override
    public Game getGame() {
        return new CoinGame();
    }
}

/////////  DiceGame
class DiceGame implements Game {
    private static Random random = new Random();

    @Override
    public void drop() {
        System.out.println("Dice is dropped: " + (random.nextInt(6) + 1));
    }
}

class DiceGameFabric implements GameFabric{
    @Override
    public Game getGame() {
        return new DiceGame();
    }
}

class Games {
    static void play(GameFabric gameFabric) {
        Game game = gameFabric.getGame();
        game.drop();
    }
}

public class Main {

    public static void main(String[] args) {
        Games.play(new CoinGameFabric());
        Games.play(new DiceGameFabric());
    }
}
