package waveFilter;

import processor.Processor;

/**
 * Created by psok on 3/30/2016.
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object o) {
        return filter.process((WaveForm)o);
    }
}
