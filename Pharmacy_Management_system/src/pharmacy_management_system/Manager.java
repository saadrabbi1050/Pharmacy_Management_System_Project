
package pharmacy_management_system;


public class Manager extends Person {
    
public String address;
public String salary;
    @Override
    public void display(){
       System.out.println(getName());
       System.out.println("Age:"+getAge());
       System.out.println("Id:"+getId());
       System.out.println("Contact:"+getContact());
       System.out.println("Address :"+address);
       System.out.println("Salary :"+salary);
       System.out.printf("\n\n");
    }
    public void CountPayment(){
        
    }
    public void DrawSalary(){
        
    }
}