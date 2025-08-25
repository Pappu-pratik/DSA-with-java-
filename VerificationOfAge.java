package JAVA_02_Conditional;
import java.util.Scanner;
public class VerificationOfAge {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult : drive ,vote");
        }

        else if ((age > 13) && (age < 18)) {
            System.out.println("teenager");
        } else {
            System.out.println("kid");
        }
    }
}
