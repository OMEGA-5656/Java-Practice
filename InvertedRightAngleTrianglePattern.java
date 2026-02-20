import java.util.*;
public class InvertedRightAngleTrianglePattern {
    public static void main(String main[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num+1; i>0;i--) {
            for(int j = i; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
