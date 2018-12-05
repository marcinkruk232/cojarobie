package loops;

import java.util.Scanner;

public class listopad {

    public static void main(String[] args) {

        System.out.println("This is output :(");

        System.err.println("This is an error muahaha");

        Scanner scanner = new Scanner(System.in);
        //system.in to jest to co providujemy w consoli czyli komunikacja z nami
        System.out.print("Please provide your name: \t");
        // \t to tabulator
        // \n - new line
        //print a nie println bo ładnie
        String name = scanner.next();
        System.out.println("Hello " + name);

        while (scanner.hasNext()) {

            String name1 = scanner.next();
            if (name1.equals("exit")) break;
            System.out.println("hello " + name1);
        }


        while (scanner.hasNextInt()) {
            // Int nam tu preventuje exception, yy w sensie że wymaga żeby był int
            Integer miau = scanner.nextInt();
            if (miau.equals(0)) break;
            System.out.println("you have " + miau + " friends");
        }


        // a to już ja sobie robie przyklad lol
        Scanner niewie = new Scanner(System.in);

        System.out.print("Please don't type: \n");

        String shutup = niewie.next();

        System.out.print("You are a: " + shutup);


    }


}
