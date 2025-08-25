package JAVA_02_Conditional;

import java.util.Scanner;

public class threeDigitNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n= sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("enter number is of three digit : " +n);
        }else {
            System.out.println("not three digit no. : "+n);
        }
    }
}

//take a positive integer input tell if it is 5 digit or not

