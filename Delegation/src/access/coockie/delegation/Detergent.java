package access.coockie.delegation;

/**
 * Created by Home on 21.02.2016.
 */
public class Detergent {
    private Cleanser cleanser = new Cleanser();

    public void appAnd(String s) {
        cleanser.appAnd(s);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void scrub() {
        appAnd(" Detergent.scrubed");
        cleanser.scrub();
    }

    public void foam() {
        appAnd(" foamed");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }
}
