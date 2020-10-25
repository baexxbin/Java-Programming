package HW05;

class BankAccount{
	// 필드
	private String name;			// 이름
	private String accountNum;		// 계좌번호
	private int balance;			// 잔액
	private static final double INTER_RATE = 2.1	;	// 이자율(상수)
	
	// 디폴트 생성자
	public BankAccount() {
		this("농협", "302-1053-8240-41", 100000);		// 매개변수 생성자 호출
	}
	
	// 매개변수 생성자
	public BankAccount(String name, String accountNum, int balance) {
		setBank(name, accountNum, balance);				// setBank매소드 호출
	}
	
	// toString 매소드
	public String toString() {
		return "이름: " + name + ", " + "계좌번호: " + accountNum + ", " + "잔액: " + balance + ", " + "이자율: " + INTER_RATE;
	}
	
	// setter 매소드
	public void setBank(String name, String accountNum, int balance) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = ((balance >= 0) ? balance : 1000000);
		
	}
	
	// getter 매소드
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
		// BankAccount 객체 생성
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("카카오뱅크", "123-456-7890", 5000);
		
		// toStirng 출력
		System.out.println(b1);
		System.out.println(b2);
		
		// 객체 내용변경
		b1.setBank("신한", "302-1053-0326-31", 1500);
		System.out.println(b1);
		
	}

}

