package HW06;

import java.util.Scanner;

class Hexabin{
	// 16진수 배열 생성(2진수)
	private String[] hexa2bin = { "0000", "0001", "0010", "0011",
			  			  		  "0100", "0101", "0110", "0111",
			  			  		  "1000", "1001", "1010", "1011",
			  			  		  "1100", "1101", "1110", "1111" };
	
	// 16진수 변환 할 문자열 저장
	private String hexa;
	
	// hexa에 대한 setter함수
	public void tobin(String s) {
		hexa = s;
	}
	
	// 변환 함수
	public void hex_bin() {
		System.out.print(hexa + "에 대한 이진수는 ");
		for(int i = 0; i < hexa.length(); i++) {
			switch(hexa.charAt(i)) {
			case '0':
				System.out.print(hexa2bin[0]+" ");
				break;
			case '1':
				System.out.print(hexa2bin[1]+" ");
				break;
			case '2':
				System.out.print(hexa2bin[2]+" ");
				break;
			case '3':
				System.out.print(hexa2bin[3]+" ");
				break;
			case '4':
				System.out.print(hexa2bin[4]+" ");
				break;
			case '5':
				System.out.print(hexa2bin[5]+" ");
				break;
			case '6':
				System.out.print(hexa2bin[6]+" ");
				break;
			case '7':
				System.out.print(hexa2bin[7]+" ");
				break;
			case '8':
				System.out.print(hexa2bin[8]+" ");
				break;
			case '9':
				System.out.print(hexa2bin[9]+" ");
				break;
			case 'a':
				System.out.print(hexa2bin[10]+" ");
				break;
			case 'b':
				System.out.print(hexa2bin[11]+" ");
				break;
			case 'c':
				System.out.print(hexa2bin[12]+" ");
				break;
			case 'd':
				System.out.print(hexa2bin[13]+" ");
				break;
			case 'e':
				System.out.print(hexa2bin[14]+" ");
				break;
			case 'f':
				System.out.print(hexa2bin[15]+" ");
				break;
			}
		}
		System.out.print(" 입니다.");
	}
	
	
}

public class HW06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// scanner 객체 생성
		
		Hexabin bin = new Hexabin(); 			// Hexabin 클래스 객체 생성
		
		System.out.print("16진수 문자열을 입력하세요: ");	// 문자열입력받기
		String str = sc.next();
		
		bin.tobin(str);										// 입력받은 문자열 hexa로 전환
		bin.hex_bin();										// 변환 함수 호출
		
	}

}
