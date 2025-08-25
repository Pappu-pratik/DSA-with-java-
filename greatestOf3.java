package JAVA_02_Conditional;

import java.util.Scanner;

public class greatestOf3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st no. :");
        int a = sc.nextInt();
        System.out.print("enter 2nd no. :");
        int b = sc.nextInt();
        System.out.print("enter 3rd no. :");
        int c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println("greater number is : "+a);
        }
        else if (b>=a && b>=c) {
            System.out.println("greater number is : " + b);
        }else {
            System.out.println("greatest number is : "+c);
        }
    }
}

//take 3 positive integers input and print the greatest of them