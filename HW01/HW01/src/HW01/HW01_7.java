package HW01;

import java.util.Scanner;	// 입력을 받기위함

public class HW01_7 {

	public static void main(String[] args) {
		int num;	// 상수로 받으라 했으므로 int형 사용
		double py;	// 실수형으로 계산이 되므로 double형 사용
		Scanner in = new Scanner(System.in);	// 입력받을 변수 생성
		
		System.out.print("평(상수)을 입력하세요: ");
		num = in.nextInt();		// num을 입력받는다
		
		py = num * 3.3058;		// 평방미터 계산
		System.out.print(num + "평은" + py + "평방미터(m^2) 입니다.");	// 결과출력
		
		in.close();		// 키보드 사용 끝, 반납

	}

}
