import java.lang.*;
import java.util.Random;

public class EmployeeWageWorkingHrAndDaysReached
{
	//instance variable
	short wagePerHour;
	short fullDayHour;
	short partTimeHour;
	int workingDayMonth;
	public static void main(String arg[])
	{
		Random rand = new Random();
		
		int checkPresent=3;
		int intRandom=rand.nextInt(checkPresent);
		
		EmployeeWageWorkingHrAndDaysReached employeeWageWorkingHrAndDaysReached = new  EmployeeWageWorkingHrAndDaysReached();
		
		employeeWageWorkingHrAndDaysReached.wagePerHour = 20;
		employeeWageWorkingHrAndDaysReached.fullDayHour= 16;

		employeeWageWorkingHrAndDaysReached.partTimeHour=8;
		
		employeeWageWorkingHrAndDaysReached.workingDayMonth = 20;
		int totalWorkingHour=0;
			int calculateFullTime = (int)(employeeWageWorkingHrAndDaysReached.wagePerHour * employeeWageWorkingHrAndDaysReached.fullDayHour);
			System.out.println("The full time employee wage is :"+calculateFullTime+"rs");
			
			
			int calculatePartTime = (int)(employeeWageWorkingHrAndDaysReached.wagePerHour * employeeWageWorkingHrAndDaysReached.partTimeHour);
			System.out.println("The part time employee wage is :"+calculatePartTime+"rs");
			int totalWorkingdayWage=0;
			int present=1;
			int totalDays=1;
		while((employeeWageWorkingHrAndDaysReached.workingDayMonth+1) != totalDays)
		{
			
		 checkPresent=3;
		 intRandom=rand.nextInt(checkPresent);
			switch (intRandom)
			{
				case 0:
					
					System.out.println();
					System.out.println("Day :"+totalDays);
					totalWorkingHour = totalWorkingHour + employeeWageWorkingHrAndDaysReached.partTimeHour;
					totalWorkingdayWage = (totalWorkingHour*(employeeWageWorkingHrAndDaysReached.wagePerHour));
					System.out.println("Total working hour "+totalWorkingHour+" and that wage "+totalWorkingdayWage);
					totalDays++;
					present++;
				break;
				case 1:
					
					System.out.println();
					System.out.println("Day :"+totalDays);
			
					totalWorkingHour = totalWorkingHour + employeeWageWorkingHrAndDaysReached.fullDayHour;
					totalWorkingdayWage = (totalWorkingHour*(employeeWageWorkingHrAndDaysReached.wagePerHour));
					System.out.println("Total working hour "+totalWorkingHour+" and that wage "+totalWorkingdayWage);
					totalDays++;
					present++;
				break;
				case 2:
				
					System.out.println();
					System.out.println("Day :"+totalDays);
			
					System.out.println("Employee is Absent");
					totalDays++;
				break;
			}
		}
			
					System.out.println("The "+present+" day employee part time wage is :"+totalWorkingdayWage+"rs");
				
	}
}