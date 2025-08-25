package JAVA_07_compositePattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of N :");
        int n= sc.nextInt();

        int nsp=n-1;
        int nst=1;
        for (int i =1; i<=n;i++){
            //space
            for (int j= 1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            //star
            for (int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

        // lower half
        nsp=1;
        nst=nst-4;
        for (int i =1; i<=n-1;i++){
            //space
            for (int j= 1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            //star
            for (int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
        //another method

        System.out.println("diamond pattern : new method");

            for (int i = 1; i <= n; i++){
                //for spaces
                for (int j = 1; j <= n -i; j++) {
                    System.out.print(" ");
                }
                //for star
                for (int j = 1; j <= (2*i)-1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (int i = n; i >=1; i--){
                //for spaces
                for (int j = 1; j <= n -i; j++) {
                    System.out.print(" ");
                }
                //for star
                for (int j = 1; j <=(2*i)-1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
    }


}
