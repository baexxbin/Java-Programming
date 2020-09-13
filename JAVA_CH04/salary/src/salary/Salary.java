package salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double salary;
		double deposit;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		salary = in.nextDouble();
		deposit = 10 * 12 * salary;
		
		System.out.println("10년 동안의 저축액: "+ deposit);
		System.out.printf("10년 동안의 저축액: %f.2\n", deposit);
		//printf사용가능
		in.close();

	}

}
