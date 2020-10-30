import java.util.Random;

class Computation{
	final int Fulltime=8;
	final int Parttime=8;
	final int EmployeeRatePerHour;
	int WorkDonePerDay,dailyWage,totalWage,hours_per_month=0,days_per_month=0 ;
	int days, hours;
	Random rand = new Random();
	Computation(int EmployeeRatePerHour, int days, int hours)
	{
		this.EmployeeRatePerHour=EmployeeRatePerHour;
		this.days=days;
		this.hours=hours;
	}
	void calculationOfTotalWage()
	{
		while(days_per_month!=days && hours_per_month<=hours)
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
		Computation calculation[]=new Computation[3];
		calculation[0]=new Computation(20,20,100);
		calculation[1]=new Computation(30,22,110);
		calculation[2]=new Computation(25,25,115);
		for(int i=0;i<3;i++)
		{
			System.out.println("\n\nEmployee Wage of Company "+i);
			calculation[i].calculationOfTotalWage();    
			calculation[i].print(); 
		}
		     
      }
}
