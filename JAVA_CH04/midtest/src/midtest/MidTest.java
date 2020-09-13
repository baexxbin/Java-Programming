package midtest;

import java.util.Scanner;

public class MidTest {

	public static void main(String[] args) {
		double rate = 1392.83;
		double dollar;
		int won;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter won: ");
		won = in.nextInt();
		
		dollar = won / rate;
		System.out.println("Dollar: "+dollar);
		System.out.printf("Dollar :%f\n", dollar);
		
		in.close(); // 키보드 이프로그램으로 부터 해제
		
	}

}
