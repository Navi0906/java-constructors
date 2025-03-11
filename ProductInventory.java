public class ProductInventory {
    String productName;
    double price;
    static int totalProducts;

    ProductInventory(String productName,double price){
        this.productName = productName;
        this.price = price;
    }

    void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: INR "+price);
    }

    void displayTotalProducts(){
        System.out.println("Total Products: "+totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Nutella", 550);
        p1.totalProducts = 1;
        p1.displayProductDetails();
        p1.displayTotalProducts();

        ProductInventory p2 =new ProductInventory("Munch", 20);
        p2.totalProducts++;
        p2.displayProductDetails();
        p2.displayTotalProducts();
    }
}
