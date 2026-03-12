import java.util.Scanner;

public class RecusionStackDemo {
    static int factorial(int n){
        System.out.println("calling factorial("+n+")");
        if(n==0){
            System.out.println("Returning 1 from factorial("+n+")");
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
        sc.close();
    }
}