class Q10{
	public static void main (String []args){
		
		double basicSalary = 40000;
		double bonusPercent = 25;
		
		double bonusAmount= basicSalary * bonusPercent / 100;

		double grossSalary= basicSalary + bonusAmount;

		double tax = 0;

		if (grossSalary>45000){
			tax = grossSalary * 0.20;
		}else{
		
			tax = grossSalary *0.10;
		
		}

		double netSalary = grossSalary - tax;


		System.out.println("---Salary breakdown---");
		System.out.println("Basic Salary $" + basicSalary);
		System.out.println("Bonus Amount $" + bonusAmount);
		System.out.println("Gross Salary $" + grossSalary);
		System.out.println("Tax $" + tax);
		System.out.println("Net Salary $" + netSalary);
	
	
	}


}
