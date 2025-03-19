import java.util.*;

class Q3{
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);

		String size = sc.next();

		switch (size){
		
			case "S":

			System.out.println("Small");
			break;

			case "L":

			System.out.println("Large");
			break;

			case "XL":

			System.out.println("Extra Large");
			break;

			default:

			System.out.println("Size not Available");
			break;

		}
	
	}


}
