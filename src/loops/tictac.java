package loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class tictac {


    public static void main(String[] args) throws FileNotFoundException {

        File ttt = new File("C:/Users/marci/Desktop/tictac.txt");

        Scanner scanner = new Scanner(ttt);

        int[][] board = new int[3][3];
        int i = 0;
        String line = null;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            String[] elems = line.split(",");
            for (int j=0; j<elems.length; j++) {
                board[i][j] = Integer.parseInt(elems[j]);
            }
            System.out.println(i + ": " + line);
            i++;

        }

        System.out.println(Arrays.deepToString(board));


        int sumawiersz [][] = new int [3][1];

        sumawiersz [0][0] = 0;
        sumawiersz [1][0] = 0;
        sumawiersz [2][0] = 0;


        for (int jj = 0; jj<=2; jj++){

            for (int ff = 0; ff < board[0].length; ff++) {

                sumawiersz[jj][0] = sumawiersz[jj][0] + board[jj][ff];

            }

        }

        // sprawdzam teraz czy over gra

        int ugh = 0;

        for(int gg = 0; gg < 3; gg++) {
            for(int ww=0; ww<3 ; ww++) {

                if(board[gg][ww] == 0){
                    ugh++;
                }
            }
        }
        if(ugh>0) {
            System.out.println("NOT OVER");
        } else {
            System.out.println("OVER");
        }

        //dobra skończyłem sprawdzać

        int przek1 = board[0][0] + board[1][1] + board[2][2];
        int przek2 = board[0][2] + board[1][1] + board[2][0];

        if(sumawiersz[0][0] == -3 || sumawiersz[1][0] == -3 || sumawiersz[2][0] == -3 || przek1==-3 || przek2==-3){
            System.out.println("O WON!!!!");
        }

        if(sumawiersz[0][0] == 3 || sumawiersz[1][0] == 3 || sumawiersz[2][0] == 3 || przek1==3 || przek2==3){
            System.out.println("X WON!!!!");
        }

    }
}