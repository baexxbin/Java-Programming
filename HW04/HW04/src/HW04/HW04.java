package HW04;

class Employee{				// Employee APIŬ����
	// �ʵ�
	private String name;	// �����̸�
	private String PhonNum;	// ��ȭ��ȣ
	private int Salary; 	// ����
	
	// name ������ & ������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// PhonNum ������ & ������
	public String getPhonNum() {
		return PhonNum;
	}
	public void setPhonNum(String phonNum) {
		PhonNum = phonNum;
	}
	
	// Salary ������ & ������
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		if (salary < 0)					// salary�� ���� �����̸� 0�� ��ȯ 
			Salary = 0;
		else
			Salary = salary;			// salary�� ���� ������ �ƴ� ��� ���޹��� �� ��ȯ
	}
	
	// toString �żҵ�
	public String toString() {
		return "name: " + name + ", " + " PhonNumber: " + PhonNum + ", " + " Salary: " + Salary;
	}
	
	// equals �żҵ�
	public boolean equals(Employee e) {
		if (name == e.name && PhonNum == e.PhonNum && Salary == e.Salary)
			return true;				// ������ true
		else
			return false;				// �ٸ��� false
	}
}

public class HW04 {						// ���� Ŭ����

	public static void main(String[] args) {
		Employee e1 = new Employee();	// ��ü e1 ����
		e1.setName("�����");
		e1.setPhonNum("010-3996-1319");
		e1.setSalary(100000000);
		
		Employee e2 = new Employee();	// ��ü e2 ����
		e2.setName("�趯��");
		e2.setPhonNum("010-1234-5678");
		e2.setSalary(70000000);
		
		// ��ü e1 �������
		System.out.println(e1.getName());	
		System.out.println(e1.getPhonNum());
		System.out.println(e1.getSalary());
		
		// ��ü e2 �������
		System.out.println();
		System.out.println(e2.getName());
		System.out.println(e2.getPhonNum());
		System.out.println(e2.getSalary());
		System.out.println();
		
		// toString �żҵ� && equals �żҵ� ���
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		
	}

}
