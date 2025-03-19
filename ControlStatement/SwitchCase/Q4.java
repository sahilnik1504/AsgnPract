import java.util.*;

class Q4{
	public static void main (String []args) {
	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		String Operation= sc.next();

		switch(Operation){
		
			case "+":

			System.out.println(num1+num2);
			break;

			case "-":
			System.out.println(num1-num2);
			break;

			case "*":

			System.out.println(num1*num2);
			break;

			case "/":
			
			System.out.println(num1/num2);
			break;

			default:

			System.out.println("ERROR");


		
		}
	
	}


}
