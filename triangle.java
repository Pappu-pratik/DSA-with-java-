package JAVA_02_Conditional;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();

        System.out.println(((a+b)>c && (b+c)>a && (c+a)>b)?"is a triangle":"is not a triangle");
    }
}
