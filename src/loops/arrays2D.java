package loops;

import java.util.Arrays;

public class arrays2D {

    public static void main(String[] args) {
        int[][] arr2d = new int [5][5];

        arr2d[0][0] = 1;
        arr2d[0][3] = 5;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[2][3] = 6;
        arr2d[3][2] = 5;
        arr2d[4][4] = 7;

        System.out.println(Arrays.deepToString(arr2d));

        System.out.println(arr2d[1][2]);


        for (int i = 0; i <= arr2d.length; i++) {

            int suma = 0;

            int[] first = arr2d[i];

            for (int j = 0; j < first.length; j++){

                suma = suma + first[j];
            }

            System.out.println(Arrays.toString(first) + " " + suma);

        }




    }


}
