import java.util.Random;

public class EmployeeWageComputation {
      public static void main(String args[])
      {
    	System.out.println("Welcome to Employee Wage Computation Program");
                  Random rand = new Random();
                  int attendance=rand.nextInt(2);
                  if(attendance==0)
                  System.out.println("Emplyoyee is Present");
                  else
                  System.out.println("Emplyoyee is Absent");
      }
}
