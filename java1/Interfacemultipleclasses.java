interface RBI{
    void findInterest();
}
class SBI implements RBI{
    public void findInterest(){
        System.out.println("SBI interest logic implementation");
    }
}
class PMB implements RBI{
    public void findInterest(){
        System.out.println("PMB interest logic implementation");
    }
}
class MHB implements RBI{
    public void findInterest(){
        System.out.println("MHB interest logic implementation");
    }
}
public class Interfacemultipleclasses {
    public static void main(String[] args) {
        RBI r1,r2,r3;
        r1=new SBI();
        r2=new PMB();
        r3=new MHB();
        r1.findInterest();
        r2.findInterest();
        r3.findInterest();
    }
}
