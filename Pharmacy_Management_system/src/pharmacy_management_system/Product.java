
package pharmacy_management_system;


public class Product {
    
    private int productID;          
    private String productName;
    private String expirationDate;
    private String manufacturedDate;
    private String productDescription;
    private int productPrice;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(String manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    
     public void display(){
       System.out.println(getProductID());
       System.out.println(getProductName());
       System.out.println(getExpirationDate());
       System.out.println(getManufacturedDate());
       System.out.println(getProductDescription());
       System.out.println(getProductPrice());

     }
    
    
}