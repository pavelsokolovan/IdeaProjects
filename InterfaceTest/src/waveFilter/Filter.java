package waveFilter;

/**
 * Created by psok on 3/30/2016.
 */
public abstract class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract WaveForm process(WaveForm waveForm);
}
