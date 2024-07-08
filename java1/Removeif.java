import java.util.*;
public class Removeif {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>(); 
        l.add("Amazon");
        l.add("Flipkart");
        l.add("Snapdeal");
        l.removeIf(s->s.charAt(0)!='A');
        System.out.println(l);
    }
}
