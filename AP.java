package JAVA_04_loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();

        // 1 3 5 7 9 ....
        for (int i=1; i<=2*n-1; i+=2){
            System.out.println(i);
        }
        System.out.println("ap of 4 7 10 13 ...");

        // 4 7 10 13 16.....
        for (int j=4; j<3*n+1; j+=3){
            System.out.println(j);
        }
        System.out.println("new ap");
        int a =4, d=3;
        for (int k=1; k<=n; k++){
            System.out.println(a);
            a+=d;
        }
    }
}
