package JAVA_05_pattern_printing;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of square : ");
        int side = sc.nextInt();

        for (int i =1; i<=side; i++){
            for (int j=1; j<=side; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
