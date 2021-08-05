package Chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, park, lee, song 4명의 인스턴스를 생성.
		
		Student kim = new Student("대학생", 20210702, "김기태", 4, 89);  
		Student park = new Student("고등학생", 20210703, "박강민", 3, 85);  
		Student lee = new Student("중학생", 20210704, "이주엽", 2, 90);  
		Student song = new Student("초등학생", 20210705, "송지효", 6, 95); 
		Student ham = new Student(); 
		
		kim.student_info();
			System.out.println();
		park.student_info();
			System.out.println();
		lee.student_info();
			System.out.println();
		song.student_info();
			System.out.println();
		ham.student_info();
		
		
		
		
		
		
		/**
		 * 
		
		kim.student_type = "대학생";
		kim.student_code = 20210702;
		kim.student_name = "김기태";
		kim.student_year = 4;
		kim.student_score = 89;
		
		park.student_type = "고등학생";
		park.student_code = 20210703;
		park.student_name = "박강민";
		park.student_year = 3;
		park.student_score = 85;
		
		lee.student_type = "중학생";
		lee.student_code = 20210704;
		lee.student_name = "이주엽";
		lee.student_year = 2;
		lee.student_score = 90;
		
		song.student_type = "초등학생";		
		song.student_code = 20210705;
		song.student_name = "송지효";
		song.student_year = 6;
		song.student_score = 95;
		
		 */
	}

}
