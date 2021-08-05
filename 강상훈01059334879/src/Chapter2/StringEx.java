package Chapter2;

public class StringEx {

	public static void main(String[] args) {
		boolean trueFalse = true;
		char munja = '문';
		int number = 1000;
		double d_number = 3.14;
		String str = "안녕하세요. 반갑습니다";
		
		System.out.println(str);
		
		String name = "강상훈";
		String add = "김해시 삼계동";
		String maleFemale = "남자";
		String PhoneNumber = "010-5933-4879";
		
		/*
		 * 이름 : 강상훈
		 * 주소 : 김해시 삼계동 
		 * 성별 : 남자
		 * 연락처 : 010-5933-4879
		 */

		System.out.println("이름 : " +name);
		System.out.println("주소 : " +add);
		System.out.println("성별 : " +maleFemale);
		System.out.println("연락처 : " +PhoneNumber);
	}
}