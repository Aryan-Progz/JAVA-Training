import java.util.*;
import java.util.ArrayList;
// public class Palindromechar {

//     public static boolean isPalindrome(String str){
//         int left =0;
//         int right=str.length()-1;
//         while(left<right){
//             if(str.charAt(left)!=str.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         ArrayList<String> al=new ArrayList<String>();
//         al.add("MOM");
//         al.add("DAD");
//         al.add("JAVA");
//         al.add("PYTHON");

//         ArrayList<String> pal=new ArrayList<String>();
//         for(String str : al){
//             if(isPalindrome(str)){
//                 pal.add(str);
//             }
//         }
//         System.out.println("Palindromes:");
        
//             System.out.println(pal);
        
//     }
// }



import java.util.ArrayList;
import java.util.List;

class Palindrome   
{  
	//recursive function to reverse a string      
	public static String reverseString(String str)  
	{  
	//checks if the string is empty   
		if(str.isEmpty())  
		{  
			//if the above condition is true returns the same string      
			return str;  
		}   
		else   
		{  
			return reverseString(str.substring(1))+str.charAt(0);  
		}  
	}  
	
	public static void main(String[] args)   
	{  
		List<String> listWords = new ArrayList<String>();
		
		listWords.add("INDIA");
		listWords.add("MOM");
		listWords.add("DAD");
		
		// using removeIf() from Collection
		listWords.removeIf(s->!s.equals(reverseString(s)));
		
		System.out.println(listWords);
		
	}  
}  