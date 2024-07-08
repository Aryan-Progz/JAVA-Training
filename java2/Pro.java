class  Program{
	public static void main(String[] args){
		double m1=60,m2=75,m3=66,m4=4,total,per;
		char grade=' ';
		total= m1+m2+m3+m4;
		per=total/4.0;
		if(per>=85)
			grade='A';
		else if(per>=75 && per<85)
			grade='B';
		else if(per>=55 && per<75)
			grade='C';
		else if(per>=40 && per<55)
			grade='D';
		else
			grade='E';
	System.out.println("percentage"+per+"grade"+grade);
	}	
}