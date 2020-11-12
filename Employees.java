package EmpWage;

import java.util.Scanner;

public class Employees {
	Scanner get = new Scanner(System.in);
	int workinghrs, days, sal,sal1,sal2;
    Employees()
    {
    	System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    public void calculatepay()
    {
        sal = 20 * workinghrs;
    }
    public void monthwisepay()
    {
    	System.out.println("Enter Number of Working Days:");
    	days = get.nextInt();
    	sal1 = 20 * days * 8;
    }
    public void monthwisepay1()
    {
    	System.out.println("Enter Number of Working Days:");
    	days = get.nextInt();
    	sal2 = 20 * days * workinghrs;
    }
    public void display()
    {
        System.out.println("=============================="+"\n"+"Employee Details"+"\n"+"=============================="+"\n");
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+sal);
        System.out.println("Salary for "+days+"working days is: $"+sal);
    }
    public void display1()
    {
        System.out.println("=============================="+"\n"+"Monthly Employee Salary Details"+"\n"+"=============================="+"\n");
        System.out.println("Salary for "+days+"working days is: $"+sal1);
    }
    public void display2()
    {
        System.out.println("=============================="+"\n"+"Monthly Employee Details"+"\n"+"=============================="+"\n");
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+days+" working days with hours is: $"+sal2);
    }
}
