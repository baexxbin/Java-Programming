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
		
		System.out.println("10�� ������ �����: "+ deposit);
		System.out.printf("10�� ������ �����: %f.2\n", deposit);
		//printf��밡��
		in.close();

	}

}
