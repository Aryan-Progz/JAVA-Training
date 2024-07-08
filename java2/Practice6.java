import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] n1=new int[]{16,17,4,3,5,2};
        int[] n2=new int[6];
        int max=n1[0];
        for(int i=0;i<n1.length;i++){
            for(int j=i+1;j<n1.length;j++){
                if(max<n1[j]){
                    n2[i]=n1[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(n2));
    }
}
