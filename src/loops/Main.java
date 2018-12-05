package loops;

public class Main {

    public static void niewiem(int n) {
        System.out.println(0);
        System.out.println(1);
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= n-2; i++) {

            int n3 = n1 + n2;
            System.out.println(n3);

            n1=n2;
            n2=n3;

        }
    }

    public static void main(String[] args) {

        niewiem(8);

    }

    //index of w mailu

}