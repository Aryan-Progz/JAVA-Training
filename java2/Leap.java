import java.util.Scanner;
class Leap{
	public static void main(String[] args){
		System.out.println("Enter a year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%100!=0){
			if(year%4==0){
				System.out.println("IS a Leap Year");
			}
			else{
				System.out.println("Not a Leap Year");
			}
		}
		else{
			if(year%400==0){
				System.out.println("Century Leap Year");
			}
			else{
				System.out.println("Not a Leap Year");
			}
		}

	}

	
}