public class EmpWage {

public static void main (String[] args)
 {
  System.out.println("Welcome to Employee Wage Calculation");
	int IS_Full_TIME = 1;
double empCheck = Math.floor(Math.random() * 10 ) % 2;
if (empCheck ==IS_Full_TIME)
System.out.println("Employee is Present");
else
System.out.println("Employee is Absent");
  }
}
