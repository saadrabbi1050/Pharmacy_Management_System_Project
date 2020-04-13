
package pharmacy_management_system;


public class main {


    public static void main(String[] args) {

    Client saad = new Client();
    Manager sobuj = new Manager();
    Worker roky = new Worker();
    NonMedicine NonMedicine1 = new NonMedicine();
    Medicine Medicine1 = new Medicine();
    
    
    
    
    saad.setName("Client Name: Saad");
    saad.setId("1111");
    saad.setAge("21");
    saad.setContact("01622346822");
    saad.address = "Ajampur";
    saad.bill = "5255";
    saad.display();
    
    sobuj.setName("Manager Name: Sobuj");
    sobuj.setId("2222");
    sobuj.setAge("21");
    sobuj.setContact("01826568682");
    sobuj.address = "Prembagan";
    sobuj.salary = "30000";
    sobuj.display();
    
    roky.setName("Worker Name: Roky");
    roky.setId("3333");
    roky.setAge("21");
    roky.setContact("01622346822");
    roky.address = "uttara";
    roky.salary = "15000";
    roky.display();
    
    

    NonMedicine1.setProductID(21052);
    NonMedicine1.setProductName("Moov");
    NonMedicine1.setProductPrice(20);
    NonMedicine1.setProductDescription("used for pain");
    NonMedicine1.setExpirationDate("20-09-2020");
    NonMedicine1.setManufacturedDate("10-01-2020");
        
    Medicine1.setProductID(1546451);
    Medicine1.setProductName("Crocin");
    Medicine1.setProductPrice(100);
    Medicine1.setProductDescription("used for fever");
    Medicine1.setExpirationDate("01-12-2020");
    Medicine1.setManufacturedDate("01-02-2020");
       
    }
}