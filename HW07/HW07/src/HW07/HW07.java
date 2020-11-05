package HW07;

class Person{
	private String name;
	private String address;
	private String phone;

	// ����Ʈ ������
	public Person(){
		this("�����", "�ƻ�", "010-3996-1319");
	}
	
	// �Ű����� ������
	public Person(String n, String a, String p) {
		name = n;
		address = a;
		phone = p;
	}
	
	// getter & setter �żҵ� 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// toString �żҵ�
	public String toString() {
		return "�̸�: " + name + ", " + "�ּ�: " + address + ", " + "��ȭ��ȣ: " + phone;
	}
	
	// equals �żҵ�
	public boolean equals(Object obj) {
		if(obj instanceof Person) {			// obj�� PersonŬ������ ��ü���� ��
			Person other = (Person)obj;		// �´ٸ� objŬ������ PersonŬ������ ����ȯ
			if(name.equals(other.name) && address.equals(other.address) && phone.equals(other.phone)) // �ʵ���� �� ��
				return true;
			else
				return false;
		}
		else
			return false;
	}
}

class Customer extends Person{
	private int index;
	private int point;
	
	// ����Ʈ ������
	public Customer() {			// super()�ڵ�����, ��������
		index = 1;
		point = 100;
	}
	
	// �Ű����� ������
	public Customer(String n, String a, String p, int i, int po) {
		super(n, a, p);			// super()�� �θ������ ȣ��
		index = i;
		point = po;
	}

	// getter & setter �żҵ�
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	// toString �żҵ�
	public String toString() {
		return super.toString() + ", " + "��ȣ: " + index + ", " + "���ϸ���: " + point;
	}
	
	// equals �żҵ�
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {					// ���� Ŭ������ ��ü���� �Ǵ�
			if (super.equals(obj)) {					// �θ�Ŭ������ ������ ������ �Ǵ�
				Customer other = (Customer)obj;			// �´ٸ� ����ȯ
				if (index == other.index && point == other.point)	// �ڽ��ʵ� ���� ��
					return true;									// ������ true
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

}

public class HW07 {

	public static void main(String[] args) {
		Person p = new Person(); 	// ����Ʈ ������, �θ�Ŭ���� ȣ��
		Customer c = new Customer(); // ����Ʈ ������, �ڽ�Ŭ���� ȣ��
		Customer c1 = new Customer("�趯��", "�λ�", "010-1234-5678", 2, 200); // �Ű����� ������, �ڽ�Ŭ���� ȣ��
		
		// ������ ��ü�� toString ȣ��
		System.out.println(p);
		System.out.println(c);
		System.out.println(c1);
		
		// equals �Ǵ�
		System.out.print("���δٸ� customer��ü c, c1��: ");
		System.out.println(c.equals(c1));
		
		System.out.print("�θ�ü p�� �Ű����� �ڽİ�üc1 ��: ");
		System.out.println(p.equals(c1));
		
	}

}
