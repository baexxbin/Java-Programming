package HW01;

import java.util.Scanner; // �Է��� �ޱ����� Scanner�� import��

public class HW01_3 {

	public static void main(String[] args) {
		double tall, feet, inch;	// ���� ����
		Scanner in = new Scanner(System.in);	//�Է¹��� ���� ����
		
		System.out.print("Ű�� �Է����ּ���: ");
		tall = in.nextDouble();	//cm���� �Է¹���
		
		inch = tall / 2.54;		// tall���� inch������ ��ȯ��
		feet = (int)inch / 12;	// feet�� ������ ����ȯ�� ��
		inch = inch - (feet *12);	// ���� inch���� ��üinch������ feet���� �� ��
		
		//System.out.printf("%d cm�� %d��Ʈ %f��ġ�Դϴ� ",tall, feet, inch);
		System.out.print(tall + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�. " );	// ������
		in.close(); 	// Ű������ ����� �������Ƿ� �ݳ���

	}

}