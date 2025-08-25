package JAVA_06_special_pattern;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("height of triangle");
        int height = sc.nextInt();
        int a =1;
        for (int i =1; i<=height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
