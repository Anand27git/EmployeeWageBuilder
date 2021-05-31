public class EmpWage {
	// declaring static variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int EmployeeWage(int wagePerHr, int maxWorkingHr, int maxWorkingDays) {
		// declaring the variables
		int totalWage = 0;
		int totalWorkingDays = 0;
		int totalHrs = 0;
		// checking with while loop
		while (totalWorkingDays < maxWorkingDays && totalHrs < maxWorkingHr) {

			int empHrs = 0;
			totalWorkingDays++;

			int empCheck = (int) (Math.random() * 3);
			// using switch statement to check the employee working time
			switch (empCheck) {

			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee is present as Full time");
				break;
			case IS_PART_TIME:

				empHrs = 4;
				System.out.println("Employee is working as part time");
				break;
			default:
				empHrs = 0;
				System.out.println("Employee is Absent");
			}
			// calculating the daily wage of an employee
			totalHrs += empHrs;
			int dailyWage = empHrs * wagePerHr;
			System.out.println("Daily Wage =" + dailyWage);
		}
		// calculating total Employee wage
		totalWage = totalHrs * wagePerHr;
		System.out.println("Total Employee Wage is " + totalWage);
		return totalWage;
	}

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wage calculation");
		EmployeeWage(20, 12, 10);

	}

}
