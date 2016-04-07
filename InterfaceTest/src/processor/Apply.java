package processor;

/**
 * Created by psok on 3/30/2016.
 */
public class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(o));
    }
}
