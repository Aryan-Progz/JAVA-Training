class Person{
    Person(){
        System.out.println("This is Person class  Constructor");
    }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("This student class Constructor");
    }
}
public class Superconstruct {
    public static void main(String[] args) {
        Student s=new Student();
    }
}
