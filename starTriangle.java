package JAVA_05_pattern_printing;

import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of triangle: ");
        int height = sc.nextInt();

        for (int i =1; i<=height; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //horizontally flipped triangle ;
        System.out.println("horizontally flipped triangle ");
        for (int i =1; i<=height; i++) {
            for (int j = 1; j <= height + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
