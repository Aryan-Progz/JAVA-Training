import java.util.ArrayList;

public class FOREACHuse {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("Aryan");
        l.add("Atharva");
        l.add("Rohit");
        l.add("Jay");

        // l.forEach(n-> {if(n.length()==3)
        // System.out.println(n);
        // });

        l.forEach(n-> {if(n.startsWith("A"))
            System.out.println(n);
            });
    }
}
