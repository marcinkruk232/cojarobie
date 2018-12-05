package loops;

import sun.awt.geom.AreaOp;

public class email {

    public static void emem(String podaj) {


        int nmalpa =  podaj.indexOf('@');
        int nkropka =  podaj.indexOf('.');
        System.out.println(nmalpa);
        System.out.println(nkropka);
        // int nkropkaftermalpa = podaj.indexOf('.', nmalpa);

        char kropka = '.';
        int ilekropek = 0;

        for (int i = 0; i < podaj.length(); i++) {
            if (podaj.charAt(i) == kropka) {
                ilekropek++;
            }
        }
        System.out.println(ilekropek);
        char malpa = '@';
        int ilemalp = 0;

        for (int i = 0; i < podaj.length(); i++) {
            if (podaj.charAt(i) == malpa) {
                ilemalp++;
            }
        }
        //lastindexOf = indexOf
        System.out.println(ilemalp);


        if(ilekropek > 1 || ilemalp > 1 || nmalpa ==  -1 || nmalpa == 0 || nmalpa == podaj.length() || nmalpa == podaj.length()-1 || nmalpa == podaj.length()-2 || nkropka == podaj.length() || nkropka < nmalpa) {
            System.out.println("not vaild");
        } else if (nkropka > nmalpa + 1 ) {


                System.out.println("valid");


        } else {
            System.out.println("not valid!");
        }
        }






    public static void main(String[] args) {

       emem("eknihi@ijr.or");

    }



}
