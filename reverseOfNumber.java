package JAVA_03_mathematical_problem;
import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to be reverse");
        int n=sc.nextInt();
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;

        }
        System.out.println();

        System.out.println("Enter another no to be reverse");
        int a=sc.nextInt();
        int rev=0;
        while(a>0){
            int last_Digit=a%10;
            rev=(rev*10)+last_Digit;
            a=a/10;
        }
        System.out.print("reversed no is: "+rev);
    }
}