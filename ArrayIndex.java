import java.util.*;

public class ArrayIndex {
    static void printElement(int[] arr,int index){
        if(index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Range se bahr.");
        }
        else{
            System.out.println(arr[index]);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of element you want to see: ");
        int index = sc.nextInt();
        try{
            printElement(arr,index);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
