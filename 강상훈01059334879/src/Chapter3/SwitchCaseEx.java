package Chapter3;

public class SwitchCaseEx {

	public static void main(String[] args) {
		int round = 1;
		boolean death = false;
		
		switch(round) {
		case 1:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 2:
			death = true;
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 3:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 4:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 5:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 6:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 7:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println(round + "���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
		case 8:
			if(death == true) {
				System.out.println(round + "���� ���ӿ��� �й��Ͽ����ϴ�.");
				round = 1;
				break;
			}
				System.out.println("��� ���� ���ӿ��� �¸��ϼ̽��ϴ�.");
				round++;
			default:
		}
		System.out.println("��������");

	}

}
