package JAVA_07_compositePattern;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            //for star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("another method");
        //another method
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            //for star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

    }
}