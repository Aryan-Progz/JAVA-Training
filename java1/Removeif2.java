//remove string having vowels

import java.util.*;

public class Removeif2 {
    
    public static void main(String[] args)
    {
        List<String> str = new ArrayList<String>();
        str.add("dad");
        str.add("cfr");
        str.removeIf(s->containsVowels(s));

        System.out.println(str);
    }


    public static boolean containsVowels(String s) {
        if (s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))
            return true;
        return false;
    }
}
