package Chapter4;
/**
 * 
 * 함수(function)
 * 메소드(method) - 클래스 안에서 정의한 함수
 * 메소드를 사용하는 이유.
 * 1) 재사용성 (유사한 소스코드를 반복적으로 작성할 필요가 없다.)
 * 2) 소스코드의 구조화 (복잡한 프로그램을 간결하게 구조화하여 프로그램을 유지 보수하기 쉽다.)
 * 3) 
 * 
 */
public class MethodEx1 {
	String 빵공장(String 재료1, String 재료2, String 재료3) {
		
		String 빵 = "빵";
		빵 = 재료1 + 재료2 + 빵;
	
		
	return 빵;
	}
	
	public static void main(String[] args) {
		MethodEx1 me1 = new MethodEx1();
		System.out.println(me1.빵공장("초코", "브라우니", ""));
	}
		

		
		// 빵공장 -> 메소드명(이름)
		// 메소드 명령문(실행문)
		// 빵을 만드려면?
		// 밀가루, 우유, 사람, 발효기, 오븐
		// (매개변수)
		// 초콜릿
		// 설탕
	
		// 결과물(~빵)
		// 리턴값(반환값)
}