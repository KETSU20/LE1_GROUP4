package IC124.LE.InventorySystem.AdStInfo;

public class Product {

    private String prodName;
    double prodPrice;
    int prodQuantity;

    public Product(){}

    public Product(String prodName, double prodPrice){

        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String getProdName() {
        return prodName;
    }
    public int getProdQuantity() {
        return prodQuantity;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void viewProdInfo(int i){

        System.out.println("\nProduct : " + (i+1));
        System.out.println("Product Name     : " + prodName);
        System.out.println("Product Price    : ₱" + prodPrice);
    }

    public void viewProdInfo(){

        System.out.println("Product Name     : " + prodName);
        System.out.println("Product Price    : " + prodPrice);
    }

    public String toString() {
        return "\nProduct Name : " + prodName + "Price : ₱" + prodPrice;
    }
}
