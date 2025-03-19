import java.util.*;

class Q1{
	public static void main (String []args){
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Traffic Signal");
		String x = sc.next();

		switch(x){
		
		case "Red":
			System.out.println("Stop");
			break;

		case "Yellow":
			System.out.println("Slow");
			break;

		case "Green": 
			System.out.println("Go");
			break;
		
		default:
			
			System.out.println("No such color is present in Traffic Lights");
			break;
		}
		
	}

}
