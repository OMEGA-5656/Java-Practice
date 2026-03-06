public class WrapperClass {
    public static void main(String args[]) {
        // 1. Define a primitive int
        int a = 20;

        // 2. Autoboxing: Converting primitive into Wrapper Object
        Integer obj = a;

        // 3. Unboxing: Converting Wrapper Object back to primitive
        int b = obj;

        System.out.println("Primitive Value (a): " + a);
        System.out.println("Wrapper Object (obj): " + obj);
        System.out.println("Unboxed Value (b): " + b);
    }
}