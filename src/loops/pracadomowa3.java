package loops;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class pracadomowa3 {


    public static void main(String[] args) throws IOException {


        File newFile = new File("C:/Users/marci/Desktop/miau/");
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            for (File f : files) {

                String name = f.getName();
                int lastIndexOf = name.lastIndexOf(".");
                String typ = name.substring(lastIndexOf);
                System.out.println(typ);

                String nazwaaa = name.substring(0,lastIndexOf);
                System.out.println(nazwaaa);

                if(typ.equals(".csv")) {

                    String miejsce = f.getAbsolutePath();
                    File plik = new File(miejsce);

                    System.out.println(miejsce);
                    System.out.println("121");


                    double percch = 0;

                    File nowyibm = new File("C:/Users/marci/Desktop/" + nazwaaa + ".csv");


                    Scanner skaner = new Scanner(plik);
                    skaner.nextLine();  //dzięki temu on nam po prostu ignoruje pierwszą linijkę

                    while (skaner.hasNext()) {
                        String dana = skaner.nextLine();  //on mi tutaj całą linijkę czyta, fajnie, ale traktuje wiersz jako jedno
                        String[] wartosci = dana.split(",");
                        double open = Double.parseDouble(wartosci[2]);  // jakby tutaj ta wartosci to jest tylko jedna linijka
                        System.out.println(open);
                        double close = Double.parseDouble(wartosci[4]);
                        System.out.println(close);

                        percch = (close - open) / open;
                        System.out.println(percch);

                        System.out.println("\n \n");

                        FileWriter fw = new FileWriter(nowyibm, true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write(dana + "," + percch);
                        bw.newLine();
                        bw.flush();


                        bw.close();
                        fw.close();
                    }






                    skaner.close();

                    //jest super tutorial na yt "java reading a csv file tutorial"
                } else { System.out.println("nie"); }

                }



            }
        }

    }

