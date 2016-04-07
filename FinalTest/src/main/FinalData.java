package main;

/**
 * Created by psok on 2/23/2016.
 */

public class FinalData {
    public final int constVol;// = 11;
    public static final int CONST_VOL_STAT = 22;

    public final Clazz constObj = new Clazz(1);
    public static final Clazz CONST_OBJ_STAT = new Clazz(2);

    public FinalData() {
        constVol = 66;
        System.out.println(constVol);
        System.out.println(CONST_VOL_STAT);
    }
}
