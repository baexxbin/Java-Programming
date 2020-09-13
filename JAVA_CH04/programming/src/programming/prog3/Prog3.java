package programming.prog3;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		double radius, volume;
		final double PI = 3.14;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		radius = in.nextDouble();
		volume = 4.0 / 3.0 * PI * radius * radius * radius;
		
		System.out.println("Volume is" + volume);
		System.out.printf("Volume : %.2f\n", volume);
		
		System.out.println(4/3);
		System.out.println(4.0/3.0);
		System.out.println(4.0/3);
		System.out.println((double)4/3);
		
		in.close();

	}

}
