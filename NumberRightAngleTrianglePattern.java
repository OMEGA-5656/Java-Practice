import java.util.*;
public class NumberRightAngleTrianglePattern {
    public static void main(String main[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<num+1;i++) {
            for(int j = 0; j<i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
