//wap to take two numbers and swap these two numbers 
// 1) using a third variable. 
// 2)using arithematic operator 
// 3)without these two 

class SwappingVariables{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println("Swapping with a third variable");
        System.out.println("Before swapping \na="+a+"\nb="+b);  
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping \na="+a+"\nb="+b);
        System.out.println();
        System.out.println("Swapping with arithematic operators");
        a=10;
        b=20;
        System.out.println("Before swapping \na="+a+"\nb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping \na="+a+"\nb="+b);
        System.out.println();
        System.out.println("Swapping with bitwise operator");
        a=10;
        b=20;
        System.out.println("Before swapping \na="+a+"\nb="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping \na="+a+"\nb="+b);
        System.out.println();
    }
}