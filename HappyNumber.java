import java.util.*;
public class HappyNumber {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        happy(a,a,0);
    }
    public static void happy(int num,int orignal,int recurCount){
        int sum=0;
        while(num>0){
            int temp = num%10;
            num /= 10;
            sum+=temp*temp;
        }
        if(recurCount>1000){
            System.out.println("Recursion goes on for far too long!");
            System.exit(0);
        }
        if(sum==1){
            System.out.println("Happy Number");
            System.exit(0);
        }
        else if(sum==orignal){
            System.out.println("Not a happy number. LOOPS.");
        }
        else{
            recurCount++;
            happy(sum,orignal,recurCount);
        }
    }
}
