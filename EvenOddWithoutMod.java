// write a program in java to take a number and check whether the number is even or odd. (without using % or /)
public class EvenOddWithoutMod {
    public static void main(String args[]){
        int a = 18;
        if((a&1)==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");
        }
    }
}

