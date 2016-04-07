package stringProcessor;

/**
 * Created by psok on 3/30/2016.
 */
public class DownCase extends StringProcessor {
    @Override
    public String process(Object o) {
        return ((String)o).toLowerCase();
    }
}
