package HW03;

import java.util.Scanner;	// Scanner객체를 사용하기위해

public class HW03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 객체 sc를 생성한다.
		
		// 문자열 입력
		System.out.print("문자열을 입력해주세요: ");
		String str= sc.nextLine();
		
		// String 객체의 StringBuffer 이용
		StringBuffer sb = new StringBuffer();
		sb.append(str);		// 문자열을 추가하는 매소드
		
		System.out.println(sb.reverse());	// 문자열을 뒤집는 매소드

	}

}
