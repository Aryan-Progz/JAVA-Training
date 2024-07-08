import java.util.*;
public class Duplicatearr {
    public static void main(String[] args) {
        String strArray[]={"Aryan","Rohit","Jay","Atharva","Sushmita","Sonali","Jay","Rohit"};
        for(int i=0;i<strArray.length;i++){
            for(int j=i+1;j<strArray.length;j++){
                if((strArray[i].equals(strArray[j]))&&(i!=j)){
                    System.out.println("Duplicate String:"+strArray[j]);
                }
            }
        }
    }    
}
