package JAVA_04_loops;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
           int lastDigit= n%10;
           sum= sum+ lastDigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
