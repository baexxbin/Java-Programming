package HW03;

import java.util.Scanner;	// Scanner객체를 사용하기위해

public class HW03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner 객체 생성
		
		System.out.print("영어 문자열을 입력해주세요: ");
		String eng = sc.nextLine();		// 영어 문자열 입력
		
		int cnt1 = 0; int cnt2 = 0;		// 자음, 모음 세는 변수

		// 글자수동안 반복하며 모음과 자음수 세기
		for (int i=0; i< eng.length(); i++) {
			if (eng.charAt(i) == 'a' || eng.charAt(i) == 'e' || eng.charAt(i) == 'i' || eng.charAt(i) == 'o' || eng.charAt(i) == 'u')
				cnt2 ++;	// 모음 카운트
			else
				cnt1 ++;	// 자음 카운트
			
		}
		// 결과출력
		System.out.print(eng + "의 자음개수: " + cnt1 + "  " + "모음개수: " + cnt2);
	}

}
