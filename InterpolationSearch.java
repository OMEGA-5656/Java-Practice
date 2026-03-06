public class InterpolationSearch {
    public static int interpolationSearch(int[]arr,int target){
        int low = 0;
        int high = arr.length;
        while(low<=high && target>=arr[low] && target<=arr[high]){
            if(low==high){
                if(arr[low]==target){
                    return low;
                }
                else{
                    return -1;
                }
            }
            int pos = low+((target-arr[low])*(high-low))/(arr[low]);
            if(arr[pos]==target){
                return pos;
            }
            else if(arr[pos]<target){
                low = pos+1;
            }
            else{
                high = pos-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,89};
        int target = 4;
        System.out.println(interpolationSearch(arr,target));
    }
}
