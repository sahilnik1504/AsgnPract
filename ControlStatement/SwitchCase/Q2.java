import java.util.*;

class Q2{
	public static void main (String []args){
		
		Scanner sc = new Scanner (System.in);
		
		char grade= sc.next().charAt(0);

		switch(grade){
		
			case 'O':

			System.out.println("Outstanding");
			break;

			case 'A':

			System.out.println("Excellent");
			break;

			case 'B':

	                System.out.println("Good");
			break;

			case 'C':

	    		System.out.println("Average");
			break;

			default:

	  		System.out.println("Fail");
		
		}
	
	}

}
