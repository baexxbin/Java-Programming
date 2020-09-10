package add2;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner 클래스로부터 input이라는 객체를 만들어(new) 집어넣어라
		int x, y, sum;
		
		System.out.println("Enter first number : ");
		x = input.nextInt(); //nextInt라는 매소드 사용
		System.out.println("Enter secound number : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		System.out.println(x + " + " + y + " = " + sum); 
	}

}
// Scanner : 외부로부터 입력을 받아드리기위한 클래스
// 키보드로 부터 입력받을때는 반드시 scanner