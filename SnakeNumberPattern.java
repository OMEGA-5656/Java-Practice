import java.util.Scanner;
public class SnakeNumberPattern {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        int top = 0, bottom = n-1, left=0, right=n-1;
        int num = 1;
        while( top<=bottom ){
            int i;
            for(i=left;i<=right;i++){
                a[top][i] = num;
                num++;
            }
            top++;
            for(i=right;i>=left;i--){
                a[top][i] = num;
                num++;
            }
            top++;
        }
        int maxLength = Integer.toString(n*n).length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                int elementLength = Integer.toString(a[i][j]).length();
                for(int len=0;len<(maxLength-elementLength); len++) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
