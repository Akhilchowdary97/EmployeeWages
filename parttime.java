package EmpWage;

import java.util.Scanner;

public class partTimeEmployees {
	Scanner get = new Scanner(System.in);
	int workinghrs, rate;
    partTimeEmployees()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    public void calculatepay()
    {
        rate = 20 * workinghrs;
    }
 
    public void display()
    {
        System.out.println("=============================="+"\n"+"Part Time Employee Details"+"\n"+"=============================="+"\n");
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
    }

}
