package JAVA_02_Conditional;
import java.util.Scanner;
public class greatestOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of A : ");
        int A= sc.nextInt();

        System.out.println("Value of B : ");
        int B= sc.nextInt();
        if (A>B){
            System.out.println(A + (": A is the greatest number"));
        } else if (A==B) {
            System.out.println(B + (" : both the value is equal"));
        }else {
            System.out.println(B + (": B is gtreatest number"));
        }
    }
}
