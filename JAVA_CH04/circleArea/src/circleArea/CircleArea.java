package circleArea;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		double area;
		
		Scanner in = new Scanner(System.in); // scanner��ü ����
		System.out.print("Enter radius : ");
		radius = in.nextDouble(); // ����ڷκ��� �Է�
		
		area =3.14 * radius * radius;
		System.out.println(area);
		System.out.printf("���� ���� : %.2f\n", area);
		
		in.close(); //scanner ��ü ����
	}

}
