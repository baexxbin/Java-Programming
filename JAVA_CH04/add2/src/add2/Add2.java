package add2;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner Ŭ�����κ��� input�̶�� ��ü�� �����(new) ����־��
		int x, y, sum;
		
		System.out.println("Enter first number : ");
		x = input.nextInt(); //nextInt��� �żҵ� ���
		System.out.println("Enter secound number : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		System.out.println(x + " + " + y + " = " + sum); 
	}

}
// Scanner : �ܺηκ��� �Է��� �޾Ƶ帮������ Ŭ����
// Ű����� ���� �Է¹������� �ݵ�� scanner