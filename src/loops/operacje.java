package loops;

import java.io.File;

public class operacje {


    public static void main(String[] args) {
        File newFile = new File("C:/Users/marci/Desktop/miau/");
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            for (File f : files) {

                String name = f.getName();
                int lastIndexOf = name.lastIndexOf(".");
                String typ = name.substring(lastIndexOf);
                System.out.println(typ);

                String miejsce = f.getAbsolutePath();
                System.out.println(miejsce);


                if(typ == ".csv") {








                }





            }
        }

    }
}