package waveFilter;

/**
 * Created by psok on 3/30/2016.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}
