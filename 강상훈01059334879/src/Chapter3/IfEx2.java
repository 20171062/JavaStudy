package Chapter3;

public class IfEx2 {

	public static void main(String[] args) {
		int age = 8;
		
		if(age >= 14 && age <= 16) {
			System.out.println("���л�");
		}else {
			if(age >= 17 && age <= 19 ) {
				System.out.println("����л�");
			}
			else {
				if(age >= 20 && age <= 26) {
					System.out.println("���л�");
				}
				else {
					System.out.println("���");
				}
			}
		}
		
	}
}