package HW03;

import java.util.Scanner;	// Scanner��ü�� ����ϱ�����

public class HW03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner ��ü ����
		
		System.out.print("���� ���ڿ��� �Է����ּ���: ");
		String eng = sc.nextLine();		// ���� ���ڿ� �Է�
		
		int cnt1 = 0; int cnt2 = 0;		// ����, ���� ���� ����

		// ���ڼ����� �ݺ��ϸ� ������ ������ ����
		for (int i=0; i< eng.length(); i++) {
			if (eng.charAt(i) == 'a' || eng.charAt(i) == 'e' || eng.charAt(i) == 'i' || eng.charAt(i) == 'o' || eng.charAt(i) == 'u')
				cnt2 ++;	// ���� ī��Ʈ
			else
				cnt1 ++;	// ���� ī��Ʈ
			
		}
		// ������
		System.out.print(eng + "�� ��������: " + cnt1 + "  " + "��������: " + cnt2);
	}

}
