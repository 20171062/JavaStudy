package Chapter3;

public class SwitchCaseEx {

	public static void main(String[] args) {
		int round = 1;
		boolean death = false;
		
		switch(round) {
		case 1:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 2:
			death = true;
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 3:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 4:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 5:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 6:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 7:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println(round + "라운드 게임에서 승리하셨습니다.");
				round++;
		case 8:
			if(death == true) {
				System.out.println(round + "라운드 게임에서 패배하였습니다.");
				round = 1;
				break;
			}
				System.out.println("모든 라운드 게임에서 승리하셨습니다.");
				round++;
			default:
		}
		System.out.println("게임종료");

	}

}
