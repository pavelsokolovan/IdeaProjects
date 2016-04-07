package main;

public class Main {

    public static void main(String[] args) {
//        FinalData.CONST_VOL_STAT = 33;
        System.out.println(FinalData.CONST_VOL_STAT);

//        FinalData.CONST_OBJ_STAT = new Clazz(121);
        FinalData.CONST_OBJ_STAT.id = 445;
        System.out.println(FinalData.CONST_OBJ_STAT.id);

        FinalData finalData = new FinalData();
        //finalData.constVol = 323;
        //finalData.constObj = new Clazz(33);
        finalData.constObj.id = 88;

        System.out.println("Blanck Final");
        BlankFinal blankFinal = new BlankFinal(555);
        System.out.println(blankFinal.constVol);
        System.out.println(BlankFinal.CONST_VOL_STAT);


    }
}
