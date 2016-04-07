package waveFilter;

/**
 * Created by psok on 3/30/2016.
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm waveForm) {
        return waveForm;
    }
}
