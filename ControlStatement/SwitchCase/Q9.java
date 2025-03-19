import java.util.*;

class Q9{
	public static void main (String []args){
	
		Scanner sc = new Scanner(System.in);

		float Maths= sc.nextFloat();
		float Science= sc.nextFloat();
		float English= sc.nextFloat();
		float Marathi= sc.nextFloat();
		float IT= sc.nextFloat();
		
		float sum = Maths + Science + English + Marathi + IT;

		float avg = sum/5;
		int grade= (int)avg/10;

		if(Maths>=35 && Science>=35 && English>=35 && Marathi>=35 && IT>=35){

			
			switch(grade){

				case 9:
					System.out.println("First class with Distinction");
					break;
				
				case 8:
					System.out.println("First Class");
					break;

				case 7:
					System.out.println("Second Class");
					break;
			
			}

		}else 
		       System.out.println("You failed in Exam");	
	
	}


}
