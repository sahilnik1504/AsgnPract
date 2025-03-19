import java.util.*;

class Q8{
	public static void main (String []args){
	
		Scanner sc = new Scanner (System.in);

			int num = sc.nextInt();
			int numb = sc.nextInt();

		if (num>=0 || numb>=0){
		
			switch(num%2){
				case 1:
					System.out.println("Odd number");
					break;

				case 0:
					System.out.println("Even number");
					break;
			}

			switch (numb%2){
			
				case 1:
					System.out.println("Odd number");
					break;

				case 0:
					System.out.println("Even number");			
			}

		}else {
		System.out.println("Sorry negative numbers are not allowed");
		}
	
	}


}

