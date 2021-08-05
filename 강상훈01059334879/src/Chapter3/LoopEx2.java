package Chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// 모든 프로그램은 무한 루프 안에서 작동한다.
		
		Scanner input = new Scanner(System.in); // 키보드의 입력을 받을 수 있게 도와주는 것
		
		boolean mLoop = true; // 마스터 루프를 제어하기 위한 제어장치
		String selecter = null;
		while(true) { //무한반복(무한루프)
			System.out.print("프로그램을 종료 하시겠습니까?(Y/N)");
			selecter = input.nextLine(); // 문자열을 입력 받아서  selecter에 저장
									 	 // selecter.equals("문자열") 문자열이 서로 같은지 비교
										 // 같으면 true, 다르면 false
			if(selecter.equals("Y")) {
				break;
			}
			else if(selecter.equals("N")) {
				System.out.println("프로그램을 계속 진행");
			}
			else {
				System.out.println("Y 또는 N만 입력이 가능");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
}