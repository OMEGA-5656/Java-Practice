import java.util.Scanner;

public class StrongNumber {
    static int fact(int n){
        int prod = 1;
        if(n==0){
            System.out.println(0);
            System.exit(0);
        }
        while(n>0){
            prod*=n;
            n-=1;
        }
        return prod;
    }

    public static void main(String args[]){
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orignal = num;
        int sumOfFacts = 0;
        while(num>0){
            int temp = num%10;
            num/=10;
            sumOfFacts+=fact(temp);
        }
        if(sumOfFacts == orignal){
            System.out.println("Strong Number.");
            System.out.println("Sum of Factorial of Digits = "+sumOfFacts);
        }
        else{
            System.out.println("Not a Strong Number.");
            System.out.println("Sum of Factorial of Digits = "+sumOfFacts);
        }
    }
}
