package processor;

/**
 * Created by psok on 3/30/2016.
 */
public interface Processor {
    String name();
    Object process(Object o);
}
