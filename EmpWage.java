public class EmpWage {

public static void main(String args[])
{
System.out.println("Welcome to Employee Wage calculation");
 
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int WORKING_HOUR =20;

int empHrs=0;
int empWage=0;
double empCheck = Math.floor(Math.random() * 10) % 3;

if (empCheck == IS_FULL_TIME)
{
	empHrs=8;
	System.out.println("Employee is present as Full time");
}
else if (empCheck == IS_PART_TIME)
{
	empHrs=8;
	System.out.println("Employee is working as part time");
}
else
{
	empHrs=0;
	System.out.println("Employee is Absent");
}
empWage=empHrs*WORKING_HOUR;
System.out.println("Employee Wage:"+ empWage);
}
}