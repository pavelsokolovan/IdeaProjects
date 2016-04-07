package main;

import processor.*;
import stringProcessor.*;
import stringProcessor2.*;
import waveFilter.*;

public class Main {

    public static void main(String[] args) {
        String st = "Public Static Void Main(String[] args)";
        Apply.process(new DownCase(), st);
        Apply.process(new Upcase(), st);

        StringShuffle stringShuffle = new StringShuffle();
        Apply.process(new StringShuffleAdapter(stringShuffle), st);

        Apply.process(new FilterAdapter(new HighPass(11.11)), new WaveForm());
        Apply.process(new FilterAdapter(new LowPass(22.22)), new WaveForm());
    }
}
