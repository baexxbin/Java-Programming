package HW08;

abstract class Book{					// 기반클래스(추상클래스)
	private int number;					// 관리번호
	private String title;				// 제목
	private String author;				// 저자
	
	// 생성자
	public Book(int n, String t, String a) {
		number = n;
		title = t;
		author = a;
	}
	
	// 필드들의 getter&setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// equals() 매소드
	public boolean equals(Object obj) {
		if(obj instanceof Book) {						// obj가 Book클래스의 객체가 맞다면
			Book other = (Book)obj;						// obj를 Book클래스로 형변환 후 Book클래스변수에 집어넣음
			if(number == other.number)  				// 관리번호가 동일하다면
				return true;							// 동일한 책
			else
				return false;
		}
		else
			return false;
	}
	
	// 추상매소드 getLateFees()
	public abstract String getLateFees(int late);		// 연체일수를 매개변수로 받는 추상매소드
	
	// toString 매소드
	public String toString() {
		return "관리번호: " + number + ", " + "제목: " + title + "," +" 저자: " + author; 
	}
}

class Novel extends Book{								// Novel, 추상클래스 상속받음
	private int Nlate;
	
	public int getNlate() {
		return Nlate;
	}

	public void setNlate(int nlate) {
		Nlate = nlate;
	}
	
	// 생성자
	public Novel(int n, String t, String a, int l) {
		super(n, t, a);
		Nlate = l;
		
	}

	public String getLateFees(int Nlate){
		return "연체료: " + 300*Nlate + "원";			// 추상매소드 구현
	}
	
	// toString()매소드
	public String toString() {
		return super.toString() + ", " +"연체일수: " + Nlate;
	}
}

class Poet extends Book{								// Poet, 추상클래스 상속받음
	public int Plate;
	
	// 생성자
	public Poet(int n, String t, String a, int l) {
		super(n, t, a);
		Plate = l;
		
	}	
	
	public int getPlate() {
		return Plate;
	}

	public void setPlate(int plate) {
		Plate = plate;
	}

	public String getLateFees(int Plate){
		return "연체료: " + 200*Plate + "원";			// 추상매소드 구현
	}
	
	// toString()매소드
	public String toString() {
		return super.toString() + ", " + "연체일수: " + Plate;
	}
}

class ScienceFiction extends Book{						// ScienceFiction, 추상클래스 상속받음
	public int Slate;
	
	// 생성자
	public ScienceFiction(int n, String t, String a, int l) {
		super(n, t, a);
		Slate = l;
		
	}
	public int getSlate() {
		return Slate;
	}
	public void setSlate(int slate) {
		Slate = slate;
	}
	public String getLateFees(int Slate){
		return "연체료: " + 600*Slate + "원";			// 추상매소드 구현
	}
	
	// toString()매소드
	public String toString() {
		return super.toString() + ", " +"연체일수: " + Slate;
	}
}

public class BookTest_6 {

	public static void main(String[] args) {
		Novel book1 = new Novel(1, "해리포터", "J.k", 2);
		Poet book2 = new Poet(2, "서시", "윤동주", 1);
		ScienceFiction book3 = new ScienceFiction(3, "신의탑","SIU", 4);
		Novel book4 = new Novel(1, "해리포터2", "J.k", 3);
		
		// 객체정보 출력
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println();
		
		// 연체료 출력
		System.out.println(book1.getTitle() +" "+ book1.getLateFees(2));
		System.out.println(book2.getTitle() +" "+ book2.getLateFees(1));
		System.out.println(book3.getTitle() +" "+ book3.getLateFees(4));
		System.out.println(book4.getTitle() +" "+ book4.getLateFees(3));
		System.out.println();
		
		// 동일책 판별
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book4));
	}

}
