package Tanks;

/**
 * Created by psok on 1/31/2016.
 */
public class TestFinalize {
    Object a;
    String b = Meth1().toString();
    private static final int c = 477;

    private Object Meth1() {
        int a;
        //static final int b;
        return a;
    }

    public static void main(String[] args) {
        createTanks();
        System.out.println("Tanks are created");
        System.gc();
        try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


    }

    static void createTanks() {
        Tank tank1 = new Tank("Tank 1", 11);
        Tank tank2 = new Tank("Tank 2", 55);
//        tank1.dispose();
//        tank2.dispose();

        TestFinalize test = new TestFinalize();
    }
}
