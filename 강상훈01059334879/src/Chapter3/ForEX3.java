package Chapter3;

public class ForEX3 {

	public static void main(String[] args) {
		// 2 ~ 19�ܱ���
		// 2��
		// 2 X 1 = 2
		// 2 X 1 = 4
		// .
		// .
		// .
		// 19�ܱ���
		for(int i = 2; i < 20; i++ ) {
			System.out.println(i + "��");
			for(int j = 1; j < 10; j++) {
			System.out.println(i + " X " + j + " = " + (i*j));
		}
		System.out.println();
	}
}}
