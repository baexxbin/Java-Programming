package programming.prog1; //��Ű��, prog1�̶�� ���� ����

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		final double FACTOR = 1.609; // ����� �빮�ڷ� ����
		double mile, km;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter mile : ");
		mile = in.nextDouble();
		
		km = FACTOR * mile;
		System.out.println(mile + "mile is" + km + "km");
		System.out.printf("%f mile is %.2f lm\n", mile, km);
		
		in.close();
				

	}

}
