import java.lang.*;
//2
public class EmployeeWaageCalculate
{
	//instance variable
	short wagePerHour;
	short fullDayHour;

	public static void main(String arg[])
	{
		EmployeeWaageCalculate dailyWage = new EmployeeWaageCalculate();
		dailyWage.wagePerHour = 20;
		dailyWage.fullDayHour=8;

		int calculate = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
		System.out.println("The daily employee wage is :"+calculate);
	}
}