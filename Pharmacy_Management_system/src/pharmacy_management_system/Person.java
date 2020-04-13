package pharmacy_management_system;


public class Person {
   
   private String name;
   private String age;
   private String id;
   private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
   public void display(){
       System.out.println(getName());
       System.out.println(getAge());
       System.out.println(getId());
       System.out.println(getContact());
   }
}