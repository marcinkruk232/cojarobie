package loops;

import java.io.*;
import java.util.Date;

public class WriteFile1411 {

    public static void main(String[] args) throws IOException {

        String home = System.getProperty("user.home");
        System.out.println(home);
        File myFile = new File(home + "/myfile.txt");

        System.out.println("Your file: " + myFile.getAbsolutePath() + " exists: " + myFile.exists() + " last modified " + new Date(myFile.lastModified()));

        FileWriter fw = new FileWriter(myFile, true); //chyba to true dodaje nam po prostu dane a nie usuwa
        BufferedWriter bw = new BufferedWriter(fw);


        //wg internetu to buffered to po prostu jakby robi tego writeraz bardziej efficinet

        bw.write("My first line");
        bw.newLine();
        bw.write("2nd line \n");
        bw.write("3rd line");

        bw.close();
        fw.close();

        //i teraz mam nowy plik taki śmieszny w C:\Users\marci

    }



}
