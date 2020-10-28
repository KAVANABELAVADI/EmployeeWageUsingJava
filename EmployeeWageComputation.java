import java.util.Random;


public class EmployeeWageComputation {
      public static void main(String args[])
      {
		  final int Fulltime=8;
		  final int EmployeeRatePerHour=20;
	          System.out.println("Welcome to Employee Wage Computation Program");
                  Random rand = new Random();
                  int attendance=rand.nextInt(2);
		  	if(attendance==0)
				System.out.println("Emplyoyee's Daily Wage "+Fulltime*EmployeeRatePerHour);
	                  else
               			System.out.println("Emplyoyee is Absent");
      }
}
