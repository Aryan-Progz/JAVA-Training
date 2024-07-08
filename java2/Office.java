import java.util.Scanner;

class Employee{
    int esal,eno;
    String name,city,position;
    Scanner sc=new Scanner(System.in);
    Employee(int esal){
        esal=esal;
    }
    void addEmp(){
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        name= sc.next();
        System.out.println("Enter City:");
        name= sc.next();
    }
    void Esal(){
        System.out.println("enter Salary:");
        esal=sc.nextInt();
    }
    void work(){
        System.out.println("Position:");
        position=sc.next();
    }
}
class HRmanager extends Employee{
    HRmanager(){
        super(200000);
    }
    // void showEmp(){
    //     System.out.println(name);
    //     System.out.println(city);
        
    // }
    void work(){
        System.out.println(position);
    }
    void getSalary(){
        System.out.println("Salary is"+esal);
    }

}
public class Office {
    public static void main(String[] args) {
        
        Employee e=new Employee(20000);
        e.work();
        HRmanager m=new HRmanager();
        m.work();
        m.addEmp();
        // m.showEmp();

    }
}
