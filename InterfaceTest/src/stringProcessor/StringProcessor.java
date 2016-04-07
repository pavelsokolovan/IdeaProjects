package stringProcessor;

import processor.Processor;

/**
 * Created by psok on 3/30/2016.
 */
public abstract class StringProcessor implements Processor{

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object o);
}
