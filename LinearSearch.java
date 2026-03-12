import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {5,66,443,1,4,532,553,2,11,23};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search element: ");
        System.out.println("Found at index: "+linearSearch(arr,sc.nextInt()));
        sc.close();
    }
}
