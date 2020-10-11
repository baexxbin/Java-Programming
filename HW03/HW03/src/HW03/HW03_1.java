package HW03;

class Movie{
	String name;		// 영화이름
	String director;	// 감독	
	double grade;			// 평점
	int year;			// 발표된 연도
	
	void print() {
		System.out.println("영화이름: " + name);
		System.out.println("감독: " + director);
		System.out.println("평점: " + grade);
		System.out.println("발표된 연도: " + year);
	}
}

public class HW03_1 {
	public static void main(String[] args) {
		Movie movie = new Movie(); // Movie객체 생성
		
		// 영화정보 입력
		movie.name = "인셉션";
		movie.director = "크리스토퍼 놀란";
		movie.grade = 9.6;
		movie.year = 2010;
		
		// 영화정보 출력
		movie.print();

	}

}
