package JAVA_02_Conditional;

import java.util.Scanner;

public class divisibleBy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        if (n%5==0 || n%3==0){
            System.out.println("Number is divisible by 5 or 3");
        }else {
            System.out.println("not divisible by 5 or 3");
        }

    }
}
