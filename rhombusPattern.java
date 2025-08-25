package JAVA_07_compositePattern;

import java.util.Scanner;

public class rhombusPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            //for space
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //for star
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            //for next line
            System.out.println();
        }
    }
}
