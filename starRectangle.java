package JAVA_05_pattern_printing;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows & cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for (int i =1; i<=rows; i++){
            for (int j=1; j<=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
