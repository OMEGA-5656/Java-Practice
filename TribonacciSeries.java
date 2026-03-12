public class TribonacciSeries {
    static int tribonacci(int n){
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
    public static void main(String args[]){
        int terms=10;
        System.out.println("Tribonacci series upto "+terms+" terms-> ");
        for(int i=0;i<terms;i++){
            System.out.println(tribonacci(i)+" ");
        }
    }
}
