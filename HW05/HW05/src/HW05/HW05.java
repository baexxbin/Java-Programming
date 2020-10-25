package HW05;

class BankAccount{
	// �ʵ�
	private String name;			// �̸�
	private String accountNum;		// ���¹�ȣ
	private int balance;			// �ܾ�
	private static final double INTER_RATE = 2.1	;	// ������(���)
	
	// ����Ʈ ������
	public BankAccount() {
		this("����", "302-1053-8240-41", 100000);		// �Ű����� ������ ȣ��
	}
	
	// �Ű����� ������
	public BankAccount(String name, String accountNum, int balance) {
		setBank(name, accountNum, balance);				// setBank�żҵ� ȣ��
	}
	
	// toString �żҵ�
	public String toString() {
		return "�̸�: " + name + ", " + "���¹�ȣ: " + accountNum + ", " + "�ܾ�: " + balance + ", " + "������: " + INTER_RATE;
	}
	
	// setter �żҵ�
	public void setBank(String name, String accountNum, int balance) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = ((balance >= 0) ? balance : 1000000);
		
	}
	
	// getter �żҵ�
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public int getBalance() {
		return balance;
	}
		
}

public class HW05 {

	public static void main(String[] args) {
		// BankAccount ��ü ����
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("īī����ũ", "123-456-7890", 5000);
		
		// toStirng ���
		System.out.println(b1);
		System.out.println(b2);
		
		// ��ü ���뺯��
		b1.setBank("����", "302-1053-0326-31", 1500);
		System.out.println(b1);
		
	}

}

