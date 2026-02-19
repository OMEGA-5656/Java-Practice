import java.util.*;
public class HammingWeight {
    public static void main(String main[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        System.out.println("Hamming weight: "+count);
    }
}
