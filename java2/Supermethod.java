class Person{
    void message(){
        System.out.println("I am person class");
    }
}
class Student extends Person{
    void message(){
        System.out.println("I am Student class");
    }
    void display(){
        message();
        super.message();
    }
}
public class Supermethod {
    public static void main(String[] args) {
       Student s=new Student();
       s.display(); 
    }
}
