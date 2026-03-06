import java.util.*;
public class BinarySearch {
    public static int search(int[]arr,int target){
        int left = 0;
        int right = arr.length;
        int mid = (left+right)/2;
        while(arr[mid]!=target){
            if(target>arr[mid]){
                left = mid;
                mid = (left+right)/2;
            }
            else{
                right = mid;
                mid = (left+right)/2;
            }
        }
        if(arr[mid]==target){
            return mid;
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {55,56,57,58,59,60,61,62,63,64};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println("\nFound "+target+" at index: "+search(arr,target));
    }
}
