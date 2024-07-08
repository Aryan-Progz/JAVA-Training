
public class Amstrong {
    public static void main(String[] args) {
        int no=123,rem, sum=0;
        int nsave=no;
        
        while (no>0) {
            rem=no%10;
            sum=sum+(rem*rem*rem);
            no=no/10;    
        }
       
        if(sum==nsave){
            System.out.println("amstrong no.");
        }
        else{
            System.out.println("Not an amstrong no.");
        }
    }
}