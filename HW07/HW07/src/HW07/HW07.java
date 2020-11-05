package HW07;

class Person{
	private String name;
	private String address;
	private String phone;

	// 디폴트 생성자
	public Person(){
		this("배수빈", "아산", "010-3996-1319");
	}
	
	// 매개변수 생성자
	public Person(String n, String a, String p) {
		name = n;
		address = a;
		phone = p;
	}
	
	// getter & setter 매소드 
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
	
	// toString 매소드
	public String toString() {
		return "이름: " + name + ", " + "주소: " + address + ", " + "전화번호: " + phone;
	}
	
	// equals 매소드
	public boolean equals(Object obj) {
		if(obj instanceof Person) {			// obj가 Person클래스의 객체인지 비교
			Person other = (Person)obj;		// 맞다면 obj클래스를 Person클래스로 형변환
			if(name.equals(other.name) && address.equals(other.address) && phone.equals(other.phone)) // 필드들의 값 비교
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
	
	// 디폴트 생성자
	public Customer() {			// super()자동생성, 생략가능
		index = 1;
		point = 100;
	}
	
	// 매개변수 생성자
	public Customer(String n, String a, String p, int i, int po) {
		super(n, a, p);			// super()로 부모생성자 호출
		index = i;
		point = po;
	}

	// getter & setter 매소드
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
	
	// toString 매소드
	public String toString() {
		return super.toString() + ", " + "번호: " + index + ", " + "마일리지: " + point;
	}
	
	// equals 매소드
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {					// 같은 클래스의 객체인지 판단
			if (super.equals(obj)) {					// 부모클래스의 내용이 같은지 판단
				Customer other = (Customer)obj;			// 맞다면 형변환
				if (index == other.index && point == other.point)	// 자식필드 내용 비교
					return true;									// 같으면 true
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
		Person p = new Person(); 	// 디폴트 생성자, 부모클래스 호출
		Customer c = new Customer(); // 디폴트 생성자, 자식클래스 호출
		Customer c1 = new Customer("김땡땡", "부산", "010-1234-5678", 2, 200); // 매개변수 생성자, 자식클래스 호출
		
		// 각각의 객체의 toString 호출
		System.out.println(p);
		System.out.println(c);
		System.out.println(c1);
		
		// equals 판단
		System.out.print("서로다른 customer객체 c, c1비교: ");
		System.out.println(c.equals(c1));
		
		System.out.print("부모객체 p와 매개변수 자식객체c1 비교: ");
		System.out.println(p.equals(c1));
		
	}

}
