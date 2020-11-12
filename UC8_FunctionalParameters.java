package EmpWage;

import java.util.Scanner;

public class UC8_FunctionalParameters {
	Scanner get = new Scanner(System.in);
	int workinghrs, days, sal,sal1;
	UC8_FunctionalParameters()
    {
         
    }
    public void calculatepay(int workinghrs)
    {
        sal = 20 * workinghrs;
    }
    public void display(int days)
    {
    	sal1 = 20 * days * 8;
    }
    public static void main(String args[])
    {
    	
    	UC8_FunctionalParameters ob1 = new UC8_FunctionalParameters();
        ob1.calculatepay(7);
        ob1.display(20);
    }
}
