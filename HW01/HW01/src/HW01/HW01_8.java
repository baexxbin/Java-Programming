package HW01;

public class HW01_8 {

	public static void main(String[] args) {
		double distance = 15000;	// �������� �¾������ �Ÿ� (����: km)
		double light_speed = 30;	// ���� �ӵ� (����: km/s) 
		double time;	// �����ϴ� �ð�
		
		time = distance / light_speed;	// ���� ������ �����ϴ� �ð� ���
		System.out.println("�������� �¾������ �Ÿ�: " + distance + "�� km");
		System.out.println("���� �ӵ�: " + light_speed + "�� km");
		System.out.println("���� �¾翡�� ����Ͽ� ������ �����ϴ� �ð�: " + time + "��");

	}

}
