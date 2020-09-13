package circleArea;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		double area;
		
		Scanner in = new Scanner(System.in); // scanner객체 생성
		System.out.print("Enter radius : ");
		radius = in.nextDouble(); // 사용자로부터 입력
		
		area =3.14 * radius * radius;
		System.out.println(area);
		System.out.printf("원의 면적 : %.2f\n", area);
		
		in.close(); //scanner 객체 해지
	}

}
