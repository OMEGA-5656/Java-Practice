import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int temp = 0;
        System.out.println(firstNum);
        System.out.println(secondNum);
        for(int i=0;i<n-2;i++){
            temp = firstNum;
            firstNum = secondNum;
            secondNum = firstNum + temp;
            System.out.println(secondNum);
        }
    }
}
