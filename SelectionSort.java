import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int minIndx = i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[j]<arr[minIndx]){
                    minIndx = j;
                }
            }
            int temp = arr[minIndx];
            arr[minIndx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int[] arr = {11,22,33,12,43,21,56,23};
        System.out.println("Before sorting: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting: "+ Arrays.toString(arr));
    }
}
