package JAVA_02_Conditional;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter cost price :");
        int cp= sc.nextInt();
        System.out.print("enter selling price :");
        int sp = sc.nextInt();

        if (sp>cp){
            System.out.print("profit : "+ (sp-cp));
        }
        if (cp==sp){
            System.out.println("NO profit and no loss");
        }else {
            System.out.print("loss :" + (cp-sp));
        }
    }
}

// given length breadth of rectangle , WAP to find whether area is greater than its perimeter

