import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        if(n==0){
            System.out.println(0);
            System.exit(0);
        }
        while(n>0){
            prod*=n;
            n-=1;
        }
        System.out.println(prod);
    }
}
