package Chapter5;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] å���� = new String[10];
		String[] reverseå���� = new String[10];
		String[] å����2 = new String[10];
		
		å����[4] = "�ڹ��� ����";
		å����[6] = "��ǰ �ڹ�";
		å����[7] = "Do it �ڹ����α׷��� �Թ�";
		å����[8] = "���α׷��� �Թ�";
		
		å����2[0] = "c��� ���α׷���";
		
		System.out.println(å����[0]);

		for(int i = 0; i < å����.length; i++) {
		if(å����[i] == null) {
				continue;
		}
			
			System.out.println(å����[i]);				
}
		for(int i = 0, j = å����.length - 1; i < å����.length; i++, j--) {
			reverseå����[j] = å����[i];
		}
		
		
		
		for(int i = 0; i < å����.length; i++) {
			if(å����[i] == null) {
				continue;
			}
			for(int j = 0; j < å����2.length; j++) {
				if(å����2[j] != null) {
					continue;
				}
				å����2[j] = å����[i];
				break;
			}
		}
		
		for(int i = 0; i < å����2.length; i++) {
			if(å����2[i] == null) {
				continue;
			}
			System.out.println(å����2[i] + " index: " + i);
		}
		
		}
	}