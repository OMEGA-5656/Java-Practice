import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {77,18,45,17,10,63};
        System.out.println("Orignal Array: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }
}
