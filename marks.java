package JAVA_02_Conditional;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks :");
        int marks= sc.nextInt();
        if (marks >= 80){
            System.out.println(marks +" is very good marks");
        } else if(marks >= 61) {
            System.out.println(marks + " is good marks ");
        } else if(marks >=41) {
            System.out.println(marks+ " is average maks");
        }else {
            System.out.println(marks +" fail");
        }
    }
}
