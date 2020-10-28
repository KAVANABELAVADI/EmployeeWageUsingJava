import java.util.Random;

class Computation{
	final int Fulltime=8;
	final int Parttime=8;
	final int EmployeeRatePerHour=20;
	int WorkDonePerDay,dailyWage,totalWage,hours_per_month=0,days_per_month=0 ;
	int days=20;
	Random rand = new Random();
	void calculationOfTotalWage()
	{
		while(days_per_month!=days && hours_per_month<=100)
		{
		int attendance=rand.nextInt(2);
		if(attendance==0)
		{
			days_per_month++;
		    WorkDonePerDay=getWorkDonePerDay();
			hours_per_month=hours_per_month+WorkDonePerDay;
			dailyWage=WorkDonePerDay*EmployeeRatePerHour;
			totalWage=dailyWage+totalWage;
		}
		else
			days--;
		}	
	}
	void print()
	{
		System.out.println("Working Days of Employee :"+days_per_month);
		System.out.println("working hours of Employee :"+hours_per_month);
		System.out.println("DailyWage of Employee :"+dailyWage);
		System.out.println("TotalWage of Employee :"+totalWage);
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
