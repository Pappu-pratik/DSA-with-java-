package JAVA_07_compositePattern;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n :");
        int n = 5;

        for (int i=1; i<=n; i++){ //outer loop

            //star-1
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            //spaces 2*(n-i)
            for (int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            //star-1
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            //spaces 2*(n-i)
            for (int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
