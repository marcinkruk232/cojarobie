package loops;

import java.util.Arrays;

public class arrays {


    public static void main(String[] args) {
        int[] arrInt = new int[3];

        for (int i=0; i<arrInt.length;i++) {
            System.out.println("Elem " + i + " = " + (arrInt[i] + 10));
        }

        int[] moje = new int[4];
        moje[0] = 4;
        moje[1] = 2;
        moje[2] = 0;

        System.out.println(Arrays.toString(moje));
        // musze dac to toString bo tak to on printuje object, a tak to content



    }





}
