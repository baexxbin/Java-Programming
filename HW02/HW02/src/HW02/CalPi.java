package HW02;

import java.util.Scanner;

public class CalPi {

	public static void main(String[] args) {
		 double divisor, dividend, sum;
	      int count;
	      int div = 2;   // 분모의 곱셈을 위한 변수
	      
	      Scanner sc = new Scanner(System.in);   
	      
	      divisor = 1.0;   // 분모 초기값
	      dividend = 4.0;   // 분자 초기값
	      sum = 3.0;   // sum 초기값
	      
	      System.out.print("Enter count : ");   
	      count = sc.nextInt();   // Enter count를 입력받음
	      
	      // 파이 계산
	      while (count > 0) {   // count동안 반복
	         for(int i = div; i < 3+div; i++) {   // 분모계산
	            divisor *= i;
	         }
	         div += 2;   // 분모의 시작 곱값 변경
	         sum = sum + dividend / divisor;
	         dividend *= -1.0;   // 부호토글을 위함
	         divisor = 1.0; // 다음 계산을 위한 분모 식의 초기
	         count --;
	      }
	      System.out.println("PI = " + sum);
	      
	      sc.close();

	}

}
