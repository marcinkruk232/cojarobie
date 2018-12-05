package loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) throws FileNotFoundException {

        File inFile = new File("d:/mytxtfile.txt");

        Scanner scanner = new Scanner(inFile);
        int i = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(i + ": " + line);
            i++;
        }

        //absoulte path to c:\....
        //relative path to jak juz jestem w directory czyli chyba folderze to tylko juz np temp\hello.java
        // a jak jestesmy w złym folderze i chcemy relative wiec musimy jakby sie cofnąć to ..\temp\hello.java
        //relative mozna na innym komputerze np


    }
}
