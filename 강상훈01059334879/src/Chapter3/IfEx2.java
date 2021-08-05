package Chapter3;

public class IfEx2 {

	public static void main(String[] args) {
		int age = 8;
		
		if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		}else {
			if(age >= 17 && age <= 19 ) {
				System.out.println("고등학생");
			}
			else {
				if(age >= 20 && age <= 26) {
					System.out.println("대학생");
				}
				else {
					System.out.println("백수");
				}
			}
		}
		
	}
}