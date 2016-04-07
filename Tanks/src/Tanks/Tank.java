package Tanks;

/**
 * Created by psok on 1/31/2016.
 */
public class Tank {
    private int volume;
    String name;

    Tank(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    void  dispose() {
        volume = 0;
    }

    void show() {
        System.out.println("Volume: " + volume);
    }

    @Override
    protected void finalize() throws Throwable {
        if (volume > 0)
            System.out.println("Wprning - Tank not reset to zero: " + name);
        super.finalize();
    }
}
