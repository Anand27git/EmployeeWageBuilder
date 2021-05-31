public class EmpWage {
	// declaring static variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WORKING_DAY_HOUR = 20;
	public static final int NUM_OF_WORKING_DAY_HOUR = 5;
	public static final int MAX_HRS_IN_MONTH = 100;

	public void CalculateEmployeeWage() {

		// declaring the variables
		int empWage = 0;
		int totalWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		// checking with while loop
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY_HOUR) {

			int empHrs = 0;
			totalWorkingDays++;

			int empCheck = (int) ((Math.random() * 10) % 3);
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

			totalEmpHrs += empHrs;
			empWage = empHrs * WORKING_DAY_HOUR;
			System.out.println("Employee Wage =" + empWage);
		}
		// calculating total Employee wage
		totalWage += empWage;
		System.out.println("Total Employee Wage is " + totalWage);

	}

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wage calculation");
		EmpWage emp = new EmpWage();
		emp.CalculateEmployeeWage();

	}

}
