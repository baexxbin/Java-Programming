package HW01;

import java.util.Scanner;	// �Է��� �ޱ�����

public class HW01_7 {

	public static void main(String[] args) {
		int num;	// ����� ������ �����Ƿ� int�� ���
		double py;	// �Ǽ������� ����� �ǹǷ� double�� ���
		Scanner in = new Scanner(System.in);	// �Է¹��� ���� ����
		
		System.out.print("��(���)�� �Է��ϼ���: ");
		num = in.nextInt();		// num�� �Է¹޴´�
		
		py = num * 3.3058;		// ������ ���
		System.out.print(num + "����" + py + "������(m^2) �Դϴ�.");	// ������
		
		in.close();		// Ű���� ��� ��, �ݳ�

	}

}
