import java.util.Scanner;

public class KaprekarNum {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prod = a*a;
        boolean flag = false;
        String temp = String.valueOf(prod);
        int temp2 = temp.length();
        for(int i=1;i<temp2;i++){
            String rest = temp.substring(i);
            int combo = Integer.parseInt(temp.substring(0,i)) + Integer.parseInt(rest);
            if (Integer.parseInt(rest)>0 && combo == a) {
                System.out.println("Kaprekar Number: " + temp.substring(0,i) + "+" + rest);
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not a Kaprekar number");
        }

    }
}
