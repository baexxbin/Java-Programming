package HW04;

class Employee{				// Employee API클래스
	// 필드
	private String name;	// 직원이름
	private String PhonNum;	// 전화번호
	private int Salary; 	// 연봉
	
	// name 접근자 & 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// PhonNum 접근자 & 설정자
	public String getPhonNum() {
		return PhonNum;
	}
	public void setPhonNum(String phonNum) {
		PhonNum = phonNum;
	}
	
	// Salary 접근자 & 설정자
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		if (salary < 0)					// salary의 값이 음수이면 0을 반환 
			Salary = 0;
		else
			Salary = salary;			// salary의 값이 음수가 아닐 경우 전달받은 값 반환
	}
	
	// toString 매소드
	public String toString() {
		return "name: " + name + ", " + " PhonNumber: " + PhonNum + ", " + " Salary: " + Salary;
	}
	
	// equals 매소드
	public boolean equals(Employee e) {
		if (name == e.name && PhonNum == e.PhonNum && Salary == e.Salary)
			return true;				// 같으면 true
		else
			return false;				// 다르면 false
	}
}

public class HW04 {						// 실행 클래스

	public static void main(String[] args) {
		Employee e1 = new Employee();	// 객체 e1 생성
		e1.setName("배수빈");
		e1.setPhonNum("010-3996-1319");
		e1.setSalary(100000000);
		
		Employee e2 = new Employee();	// 객체 e2 생성
		e2.setName("김땡땡");
		e2.setPhonNum("010-1234-5678");
		e2.setSalary(70000000);
		
		// 객체 e1 내용출력
		System.out.println(e1.getName());	
		System.out.println(e1.getPhonNum());
		System.out.println(e1.getSalary());
		
		// 객체 e2 내용출력
		System.out.println();
		System.out.println(e2.getName());
		System.out.println(e2.getPhonNum());
		System.out.println(e2.getSalary());
		System.out.println();
		
		// toString 매소드 && equals 매소드 출력
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		
	}

}
