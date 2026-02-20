import java.util.Scanner;
public class DiagonalSnakeNumberPattern {
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int num = 1;
        boolean flagRight = true;
        for(int d = 0; d<2*n-1; d++){
            if(flagRight){
                int row;
                int col;
                if(d<n){
                    row = d;
                    col = 0;
                }
                else{
                    row = n-1;
                    col = d-n+1;
                }
                while(row>=0 && col<n){
                    a[row][col] = num;
                    num++;
                    row--;
                    col++;
                }
                flagRight = false;
            }
            else{
                int row;
                int col;
                if(d<n){
                    row = 0;
                    col = d;
                }
                else{
                    row = d-n+1;
                    col = n-1;
                }
                while(col>=0 && row<n){
                    a[row][col] = num;
                    num++;
                    col--;
                    row++;
                }
                flagRight = true;
            }
        }
        //pretty print
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
