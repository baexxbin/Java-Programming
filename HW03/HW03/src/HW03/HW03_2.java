package HW03;

import java.util.Scanner;	// Scanner��ü�� ����ϱ�����

public class HW03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner ��ü sc�� �����Ѵ�.
		
		// ���ڿ� �Է�
		System.out.print("���ڿ��� �Է����ּ���: ");
		String str= sc.nextLine();
		
		// String ��ü�� StringBuffer �̿�
		StringBuffer sb = new StringBuffer();
		sb.append(str);		// ���ڿ��� �߰��ϴ� �żҵ�
		
		System.out.println(sb.reverse());	// ���ڿ��� ������ �żҵ�

	}

}
