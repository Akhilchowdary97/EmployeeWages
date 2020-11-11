package EmpWage;
import java.util.Scanner;
public class UC4_switchcase 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:
			System.out.println("fullTime -"+fullTimeEmployees);
			break;
		case 2:
			System.out.println("partTime -"+partTimeEmployees);
			break;
		}
	}
}
