import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num*4+1;
        for(int i = 0; i<num;i++){
            int charCount = temp;
            for(int j=0; j<charCount;j++){
                if(j<=num){
                    for(int k=0;k<i;k++){
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                for(int k=num-1;k>0;k--){
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
