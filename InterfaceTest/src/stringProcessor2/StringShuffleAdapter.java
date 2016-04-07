package stringProcessor2;

import processor.Processor;

/**
 * Created by psok on 3/30/2016.
 */
public class StringShuffleAdapter implements Processor {
    private StringShuffle stringShuffle;

    public StringShuffleAdapter(StringShuffle stringShuffle) {
        this.stringShuffle = stringShuffle;
    }

    @Override
    public String name() {
        return stringShuffle.getClass().getSimpleName();
    }

    @Override
    public String process(Object o) {
        return stringShuffle.shuffle((String)o);
    }
}
