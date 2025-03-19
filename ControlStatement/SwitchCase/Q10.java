import java.util.*;


class Q10{
	public static void main (String []args){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Welcome to Customer Support!!!");

		System.out.println("Select an Option:");
		System.out.println("1.Billing");
		System.out.println("2.Technical Support");
		System.out.println("3.Account Details");
		System.out.println("4.Speak to Representive");
		System.out.println("5.Exit");

		int choice = sc.nextInt();

		switch (choice){
		
			case 1:
				System.out.println("Connecting to Billing Department......");
				break;
			
			case 2:
				System.out.println("Redirecting to Technical Support......");
				break;
			
			case 3:
				System.out.println("Providing your Account Details.....");
				break;

			case 4:
				System.out.println("Shortly Connecting you with our Representive");
				break;

			case 5:
				System.out.println("Thank you for contacting us! Have a great day!!!");
				break;

			default:
				System.out.println("Invalid Choice");

		}
	
	
	}


}
