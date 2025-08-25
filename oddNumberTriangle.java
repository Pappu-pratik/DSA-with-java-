package JAVA_06_special_pattern;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of triangle: ");
        int height = sc.nextInt();

        System.out.println("triangle with odd number");
        for (int i =1; i<=height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }

        System.out.println("another method ");
        for (int i =1; i<=height; i++) {
            int a=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
