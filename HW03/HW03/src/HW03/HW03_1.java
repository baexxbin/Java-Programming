package HW03;

class Movie{
	String name;		// ��ȭ�̸�
	String director;	// ����	
	double grade;			// ����
	int year;			// ��ǥ�� ����
	
	void print() {
		System.out.println("��ȭ�̸�: " + name);
		System.out.println("����: " + director);
		System.out.println("����: " + grade);
		System.out.println("��ǥ�� ����: " + year);
	}
}

public class HW03_1 {
	public static void main(String[] args) {
		Movie movie = new Movie(); // Movie��ü ����
		
		// ��ȭ���� �Է�
		movie.name = "�μ���";
		movie.director = "ũ�������� ���";
		movie.grade = 9.6;
		movie.year = 2010;
		
		// ��ȭ���� ���
		movie.print();

	}

}
