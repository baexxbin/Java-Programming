package HW01;

import java.util.Scanner; // 입력을 받기위해 Scanner를 import함

public class HW01_3 {

	public static void main(String[] args) {
		double tall, feet, inch;	// 변수 선언
		Scanner in = new Scanner(System.in);	//입력받을 변수 생성
		
		System.out.print("키를 입력해주세요: ");
		tall = in.nextDouble();	//cm값을 입력받음
		
		inch = tall / 2.54;		// tall값을 inch값으로 변환함
		feet = (int)inch / 12;	// feet는 정수로 형변환을 함
		inch = inch - (feet *12);	// 최종 inch값은 전체inch값에서 feet값을 뺀 값
		
		//System.out.printf("%d cm는 %d피트 %f인치입니다 ",tall, feet, inch);
		System.out.print(tall + "cm는 " + feet + "피트 " + inch + "인치입니다. " );	// 결과출력
		in.close(); 	// 키보드의 사용이 끝났으므로 반납함

	}

}