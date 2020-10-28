import java.util.Random;

class Computation{
	final int Fulltime=8;
	final int Parttime=8;
	final int EmployeeRatePerHour=20;
	int WorkDonePerDay,dailyWage,totalWage,hours_per_month=0 ;
	Random rand = new Random();
	void calculationOfTotalWage()
	{
		int attendance=rand.nextInt(2);
		if(attendance==0)
		{
		    WorkDonePerDay=getWorkDonePerDay();
			hours_per_month=hours_per_month+WorkDonePerDay;
			dailyWage=WorkDonePerDay*EmployeeRatePerHour;
			
		}
		else
			System.out.println("Emplyoyee is Absent");
	}
	void print()
	{
		System.out.println("DailyWage of Employee :"+dailyWage);
		
	}
	int getWorkDonePerDay()
	{
		int workdone=rand.nextInt(2);
		switch (workdone) {
			case 0: WorkDonePerDay=Fulltime;
					break;
			case 1: WorkDonePerDay=Parttime;
					break;
			default: WorkDonePerDay=0;
		}
		return WorkDonePerDay;
	}
}
public class EmployeeWageComputation {
      public static void main(String args[])
      {
		System.out.println("Welcome to Employee Wage Computation Program");
		Computation calculation=new Computation();
		calculation.calculationOfTotalWage();    
		calculation.print();      
      }
}
