public class Normalarg {
    void m1(int... a){
        System.out.println("variable argument="+a);
    }
    void m1(int a){
        System.out.println("normal argument="+a);
    }
    public static void main(String[] args) {
        Normalarg n= new Normalarg();
        n.m1(10);
    }
}
