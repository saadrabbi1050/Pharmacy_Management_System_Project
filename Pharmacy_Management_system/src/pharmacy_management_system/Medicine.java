
package pharmacy_management_system;



public class Medicine extends Product {
    
    @Override
    public void display(){
       System.out.println(getProductName());
       System.out.println(getProductID()+"Id:");
       System.out.println(getExpirationDate()+"ExpirationDate:");
       System.out.println(getManufacturedDate()+"ManufacturedDate:");
        String getProductDescription = null;
       System.out.println(getProductDescription+"ProductDescription :");
        String getProductPrice = null;
       System.out.println(getProductPrice+"ProductPrice :");
       System.out.printf("\n\n");
   
    }
    
    
     public void addnonmedicine(){
        
    }
    public void editnonmedicine(){
        
    }
     public void deletenonmedicine(){
        
    }
      public void searchnonmedicine(){
        
    }
   
   
}
