//Design an online shopping system using inheritance.
//
//1. Create a class Product:
//- Instance variables: productName, price
//- Static block to print "Product class loaded"
//- IIB to print "Product object created"
//- Constructor to initialize variables
//- Method calculateDiscount() that returns price (no discount)
class Product{
    String productName;
    double price;
    {
        System.out.println("Product object created");
    }
    Product(String productName,double price){
        this.price = price;
        this.productName = productName;
    }
    double calculateDiscount() {
        return price;
    }
}

//2. Create a class Electronics that extends Product:
//- Extra variable: warrantyYears
//- Override calculateDiscount() to apply 10% discount

class Electronics extends Product{
    int warrantyYears;

    Electronics(String productName, double price) {
        super(productName, price);
    }

    @Override
    double calculateDiscount(){
        return price-(price*0.1);
    }
}

//3. In main:
//- Create object using:
//  Product p = new Electronics(...);
//- Display final discounted price.

public class Question1 {
    public static void main(String args[]){
        Product p = new Electronics("pcb",10);
        System.out.println(p.calculateDiscount());
    }
}
