package HW01;

import java.util.Scanner;	// 사용자의 입력을 받기위함

public class HW01_9 {

	public static void main(String[] args) {
		double P, S, pressure;	// 힘, 면적, 압력 변수
		Scanner in = new Scanner(System.in);	// 입력받을 in생성
		
		System.out.print("물체에 주어진 힘을 입력해주세요: ");	// 사용자로부터 입력받음
		P = in.nextDouble();
		System.out.print("물체의 면적을 입력해주세요: ");
		S = in.nextDouble();	
		
		pressure = P/S;		// 압력 계산
		System.out.print("압력의 세기: " + pressure);	// 결과출력
		
		in.close();	// 키보드사용 후 반납
	}

}
