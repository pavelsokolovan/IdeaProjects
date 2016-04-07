package EntryPoint;


import java.util.Arrays;
import java.util.Objects;

/**
 * Created by psok on 2/12/2016.
 */
public class EntryPoint {
    public static void main(String... args) {
        for (String item: args)
            System.out.print(item);
        System.out.println();
        int[] a = {1,2,3,4,5};
        int[] a1 = new int[] {12,3,4,5};
        Integer b = 100;
        Object obj = new Object();
        Meth(1,2,3,4,5,6);
        Meth();
        Meth(new int[] {2,3,4,5});
        Object[] objArray = new Integer[] {1,2,3,4,3,5};
        System.out.println(obj);

        MyEnum en = MyEnum.THREE;
        System.out.println();
        System.out.println(en.name());
        System.out.println();
        System.out.println(MyEnum.values().getClass());

        System.out.println(Arrays.toString(a));
        System.out.println(new Object[0].getClass());
    }

    public static void Meth(int... a) {
    }

    public enum MyEnum {
        ONE,
        TWO,
        THREE,
    }
}
