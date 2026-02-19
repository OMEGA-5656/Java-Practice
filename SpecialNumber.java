// special number, extract the digits, 2 digit numbers are a special number.
class SpecialNumber{
    public static void main(String args[]){
        int a = 19;
        int first = 1;
        int last = 9;
        int sum = first+last;
        int prod = first*last;
        if((sum+prod)==a){
            System.out.println("It is a special number");
        }
        else{
            System.out.println("Not a special number");
        }
    }
}