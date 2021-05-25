public class EmpWage {

public static final int IS_FULL_TIME = 1;
public static final int IS_PART_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int Num_Of_Working_Days = 5;
public static final int MAX_HRS_IN_MONTH = 10 ;

public static void main(String args[])
{
System.out.println("Welcome to Employee Wage calculation");
 
// variables
int empHrs=0;
int totalEmpHrs=0;
int totalWorkingDays=0;
//Computation
    while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
          totalWorkingDays < Num_Of_Working_Days) {
               
                totalWorkingDays++;
int empCheck = (int) Math.floor(Math.random() * 10) % 3;
     
         switch(empCheck) {

          case IS_FULL_TIME:
         	empHrs=8;
	      System.out.println("Employee is present as Full time");
	         break;
          case IS_PART_TIME:

	        empHrs=4;
	       System.out.println("Employee is working as part time");
	         break;
    	default:
	empHrs=0;
	System.out.println("Employee is Absent");
       }
	totalEmpHrs +=empHrs;
	System.out.println("Day#: " + totalWorkingDays + " Emp Hr:" + empHrs);
     }
int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
System.out.println("Total Employee Wage:" + totalEmpWage);
  }
 
}
