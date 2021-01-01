package HW08;

abstract class Book{					// ���Ŭ����(�߻�Ŭ����)
	private int number;					// ������ȣ
	private String title;				// ����
	private String author;				// ����
	
	// ������
	public Book(int n, String t, String a) {
		number = n;
		title = t;
		author = a;
	}
	
	// �ʵ���� getter&setter
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
	
	// equals() �żҵ�
	public boolean equals(Object obj) {
		if(obj instanceof Book) {						// obj�� BookŬ������ ��ü�� �´ٸ�
			Book other = (Book)obj;						// obj�� BookŬ������ ����ȯ �� BookŬ���������� �������
			if(number == other.number)  				// ������ȣ�� �����ϴٸ�
				return true;							// ������ å
			else
				return false;
		}
		else
			return false;
	}
	
	// �߻�żҵ� getLateFees()
	public abstract String getLateFees(int late);		// ��ü�ϼ��� �Ű������� �޴� �߻�żҵ�
	
	// toString �żҵ�
	public String toString() {
		return "������ȣ: " + number + ", " + "����: " + title + "," +" ����: " + author; 
	}
}

class Novel extends Book{								// Novel, �߻�Ŭ���� ��ӹ���
	private int Nlate;
	
	public int getNlate() {
		return Nlate;
	}

	public void setNlate(int nlate) {
		Nlate = nlate;
	}
	
	// ������
	public Novel(int n, String t, String a, int l) {
		super(n, t, a);
		Nlate = l;
		
	}

	public String getLateFees(int Nlate){
		return "��ü��: " + 300*Nlate + "��";			// �߻�żҵ� ����
	}
	
	// toString()�żҵ�
	public String toString() {
		return super.toString() + ", " +"��ü�ϼ�: " + Nlate;
	}
}

class Poet extends Book{								// Poet, �߻�Ŭ���� ��ӹ���
	public int Plate;
	
	// ������
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
		return "��ü��: " + 200*Plate + "��";			// �߻�żҵ� ����
	}
	
	// toString()�żҵ�
	public String toString() {
		return super.toString() + ", " + "��ü�ϼ�: " + Plate;
	}
}

class ScienceFiction extends Book{						// ScienceFiction, �߻�Ŭ���� ��ӹ���
	public int Slate;
	
	// ������
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
		return "��ü��: " + 600*Slate + "��";			// �߻�żҵ� ����
	}
	
	// toString()�żҵ�
	public String toString() {
		return super.toString() + ", " +"��ü�ϼ�: " + Slate;
	}
}

public class BookTest_6 {

	public static void main(String[] args) {
		Novel book1 = new Novel(1, "�ظ�����", "J.k", 2);
		Poet book2 = new Poet(2, "����", "������", 1);
		ScienceFiction book3 = new ScienceFiction(3, "����ž","SIU", 4);
		Novel book4 = new Novel(1, "�ظ�����2", "J.k", 3);
		
		// ��ü���� ���
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println();
		
		// ��ü�� ���
		System.out.println(book1.getTitle() +" "+ book1.getLateFees(2));
		System.out.println(book2.getTitle() +" "+ book2.getLateFees(1));
		System.out.println(book3.getTitle() +" "+ book3.getLateFees(4));
		System.out.println(book4.getTitle() +" "+ book4.getLateFees(3));
		System.out.println();
		
		// ����å �Ǻ�
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book4));
	}

}
