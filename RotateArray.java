import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lastElement = arr[n-1];
        for(int i =0; i<n;i++){
            int temp = arr[i];
            arr[i]=lastElement;
            lastElement = temp;
        }
        System.out.println("The new array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
