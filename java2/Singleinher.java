class A{
    public void showA(){
        System.out.println("I am in showA");
    }
}
class B extends A{
    public void showB(){
        System.out.println("I am in showB");
    }
}
public class Singleinher {
    public static void main(String[] args) {
        B obj=new B();
        obj.showA();
        obj.showB();
        A obj1=new A();
        obj1.showA();
    }
}
