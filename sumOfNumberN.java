package JAVA_03_mathematical_problem;
import java.util.Scanner;

public class sumOfNumberN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int n= sc.nextInt();
        int sum =0;

        int i=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

        System.out.println("another number");
        int a=sc.nextInt();
        int sum_of_num= 0;
        for (int j = 0; j <= a; j++) {
            sum_of_num = sum_of_num + j;
        }
        System.out.println(sum_of_num);
    }
}
