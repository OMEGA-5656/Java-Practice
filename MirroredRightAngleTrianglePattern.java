import java.util.*;
public class MirroredRightAngleTrianglePattern {
    public static void main(String main[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<num+1 ; i++) {
            for(int j = num-i; j>0 ; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
