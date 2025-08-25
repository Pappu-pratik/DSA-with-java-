package JAVA_02_Conditional;

import java.util.Scanner;
public class taxVerification {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax = 0;
        if (income<500000){
            System.out.println(("your tax is: ") +tax  );
        } else if ((income>500000) & (income<=1000000)) {
            System.out.println(("your tax is: ") +(tax=(int) (income*0.2)));
        }
        else{
            System.out.println(("your tax is: ") +(tax=(int) (income*0.3)));
        }
    }
}
