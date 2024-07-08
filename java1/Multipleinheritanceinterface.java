interface Abc{
    public void show();
}
class Pqr{
    static int i=20;
}
public class Multipleinheritanceinterface extends Pqr implements Abc {
    public void show(){
        System.out.println("I am in abc");
    }
    public static void main(String[] args) {
        Abc a;
        Multipleinheritanceinterface z=new Multipleinheritanceinterface();
        a=z;
        a.show();
        System.out.println(i);
    }
}
