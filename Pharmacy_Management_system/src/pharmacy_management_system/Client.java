
package pharmacy_management_system;


public class Client extends Person {
    
    public String address;
    public String bill;
    
    @Override
    public void display(){
       System.out.println(getName());
       System.out.println("Age:"+getAge());
       System.out.println("Id:"+getId());
       System.out.println("Contact:"+getContact());
       System.out.println("Address :"+address);
       System.out.println("Bill :"+bill);
       System.out.printf("\n\n");
   
    }
    
    public void Registration(){
        
    }
    public void BillPay(){
        
    }
}
