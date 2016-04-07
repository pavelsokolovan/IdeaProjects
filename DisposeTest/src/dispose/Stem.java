package dispose;

/**
 * Created by psok on 2/22/2016.
 */
public class Stem extends Root {
    public Stem() {
        System.out.println("Stem Constructor");
    }

    public void dispose() {
        super.dispose();
        System.out.println("Stem Dispose");
    }
}
