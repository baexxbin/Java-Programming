package HW02;

import java.util.Scanner;

public class CalPi {

	public static void main(String[] args) {
		 double divisor, dividend, sum;
	      int count;
	      int div = 2;   // �и��� ������ ���� ����
	      
	      Scanner sc = new Scanner(System.in);   
	      
	      divisor = 1.0;   // �и� �ʱⰪ
	      dividend = 4.0;   // ���� �ʱⰪ
	      sum = 3.0;   // sum �ʱⰪ
	      
	      System.out.print("Enter count : ");   
	      count = sc.nextInt();   // Enter count�� �Է¹���
	      
	      // ���� ���
	      while (count > 0) {   // count���� �ݺ�
	         for(int i = div; i < 3+div; i++) {   // �и���
	            divisor *= i;
	         }
	         div += 2;   // �и��� ���� ���� ����
	         sum = sum + dividend / divisor;
	         dividend *= -1.0;   // ��ȣ����� ����
	         divisor = 1.0; // ���� ����� ���� �и� ���� �ʱ�
	         count --;
	      }
	      System.out.println("PI = " + sum);
	      
	      sc.close();

	}

}
