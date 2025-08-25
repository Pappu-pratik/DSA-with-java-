package JAVA_04_loops;

import java.util.Scanner;

public class compositeNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();

        int x=0;
        for (int i=2; i<=n; i++){
            if (n%i==0){  //i is a factor of n
                System.out.println("composite number : "+n);
                x=1; // 1 means composite
                break;
            }
        }
        if (n==1){
            System.out.println("neither prime nor composite ");
        }
        else if (x==0){
            System.out.println("prime number : "+n);
        }
    }
}
