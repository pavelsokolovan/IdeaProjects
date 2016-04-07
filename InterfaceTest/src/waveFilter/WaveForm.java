package waveFilter;

/**
 * Created by psok on 3/30/2016.
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "WaveForm " + id;
    }
}
