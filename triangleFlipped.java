package JAVA_06_special_pattern;

import java.util.Scanner;

public class triangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of square : ");
        int side = sc.nextInt();

        for (int i =1; i<=side; i++){
            for (int j=1; j<=side; j++){
                if (i+j>side) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
