package JAVA_03_mathematical_problem;

public class simpleInterest {
    public static void main(String[] args) {
        double principle =2000;
        double rate =3.75;
        double time = 3.5;
        double simpleInterest = (principle*rate*time)/100;
        System.out.println("Interest on 2000 are :"+simpleInterest);
    }
}
