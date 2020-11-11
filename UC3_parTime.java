package EmpWage;

public class UC3_partTimeEmployeeWage {
	public static void main(String args[])
    {
        System.out.println("================================"+"\n"+"Enter Part Time Employee Details"+"\n"+"================================"+"\n");
        partTimeEmployees ob2 = new partTimeEmployees();
        ob2.calculatepay();
        ob2.display();
        
    }
}
