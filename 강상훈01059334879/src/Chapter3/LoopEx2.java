package Chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// ��� ���α׷��� ���� ���� �ȿ��� �۵��Ѵ�.
		
		Scanner input = new Scanner(System.in); // Ű������ �Է��� ���� �� �ְ� �����ִ� ��
		
		boolean mLoop = true; // ������ ������ �����ϱ� ���� ������ġ
		String selecter = null;
		while(true) { //���ѹݺ�(���ѷ���)
			System.out.print("���α׷��� ���� �Ͻðڽ��ϱ�?(Y/N)");
			selecter = input.nextLine(); // ���ڿ��� �Է� �޾Ƽ�  selecter�� ����
									 	 // selecter.equals("���ڿ�") ���ڿ��� ���� ������ ��
										 // ������ true, �ٸ��� false
			if(selecter.equals("Y")) {
				break;
			}
			else if(selecter.equals("N")) {
				System.out.println("���α׷��� ��� ����");
			}
			else {
				System.out.println("Y �Ǵ� N�� �Է��� ����");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}