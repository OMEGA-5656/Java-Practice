import java.util.*;
public class ArmstrongNumber {
    public static void main(String main[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int count = 0;
        int sum = 0;
        while(temp>0) {
            temp /= 10;
            count++;
        }
        int temp2 = a;
        while(temp2>0){
            int temp3 = temp2%10;
            temp2/=10;
            sum+= Math.pow(temp3,count);
        }
        if(sum==a){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
