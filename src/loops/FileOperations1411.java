package loops;

import java.sql.SQLOutput;
import java.util.Properties;

public class FileOperations1411 {

    public static void main(String[] args) {

        String tmp = System.getenv("TMP");
        System.out.println(tmp);

        //chcemy teraz to skonwertować do directory file

        Properties props = System.getProperties();

        tmp = System.getProperty("java.io.tmpdir");
        System.out.println(tmp);

        String myProp = System.getProperty("myprop", "defaultValue");
        System.out.println("myprop: " + myProp);

        tmp = System.getProperty("os:name");
        System.out.println(tmp);

        tmp = System.getProperty("user.home");
        System.out.println(tmp);


        //property jest lepszym solution niż environment
        //można wygooglać java properties i guess
    }



}
