package HW01;

import java.util.Scanner;	// ������� �Է��� �ޱ�����

public class HW01_9 {

	public static void main(String[] args) {
		double P, S, pressure;	// ��, ����, �з� ����
		Scanner in = new Scanner(System.in);	// �Է¹��� in����
		
		System.out.print("��ü�� �־��� ���� �Է����ּ���: ");	// ����ڷκ��� �Է¹���
		P = in.nextDouble();
		System.out.print("��ü�� ������ �Է����ּ���: ");
		S = in.nextDouble();	
		
		pressure = P/S;		// �з� ���
		System.out.print("�з��� ����: " + pressure);	// ������
		
		in.close();	// Ű������ �� �ݳ�
	}

}
