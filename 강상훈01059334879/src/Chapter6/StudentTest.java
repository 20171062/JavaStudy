package Chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, park, lee, song 4���� �ν��Ͻ��� ����.
		
		Student kim = new Student("���л�", 20210702, "�����", 4, 89);  
		Student park = new Student("����л�", 20210703, "�ڰ���", 3, 85);  
		Student lee = new Student("���л�", 20210704, "���ֿ�", 2, 90);  
		Student song = new Student("�ʵ��л�", 20210705, "����ȿ", 6, 95); 
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
		
		kim.student_type = "���л�";
		kim.student_code = 20210702;
		kim.student_name = "�����";
		kim.student_year = 4;
		kim.student_score = 89;
		
		park.student_type = "����л�";
		park.student_code = 20210703;
		park.student_name = "�ڰ���";
		park.student_year = 3;
		park.student_score = 85;
		
		lee.student_type = "���л�";
		lee.student_code = 20210704;
		lee.student_name = "���ֿ�";
		lee.student_year = 2;
		lee.student_score = 90;
		
		song.student_type = "�ʵ��л�";		
		song.student_code = 20210705;
		song.student_name = "����ȿ";
		song.student_year = 6;
		song.student_score = 95;
		
		 */
	}

}
