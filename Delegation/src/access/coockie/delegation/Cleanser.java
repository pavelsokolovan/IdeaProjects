package access.coockie.delegation;

/**
 * Created by Home on 21.02.2016.
 */
public class Cleanser {
    private String done = "Cleanser";

    public void appAnd(String s) {
        done += s;
    }

    public void dilute() {
        appAnd(" diluted");
    }

    public void scrub() {
        appAnd(" scrubed");
    }

    @Override
    public String toString() {
        return done;
    }
}
