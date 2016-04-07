package main;

/**
 * Created by psok on 2/23/2016.
 */
public class BlankFinal {
    public final int constVol;
    public static final int CONST_VOL_STAT;

//    {
//        constVol = 11;
//    }
//
    static {
        CONST_VOL_STAT = 22;
    }

    public BlankFinal() {
        constVol = 111;
        //CONST_VOL_STAT = 222;
    }

    public BlankFinal(int i) {
        constVol = i;
        //CONST_VOL_STAT = 222;
    }
}
