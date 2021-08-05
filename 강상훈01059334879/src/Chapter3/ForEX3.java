package Chapter3;

public class ForEX3 {

	public static void main(String[] args) {
		// 2 ~ 19단까지
		// 2단
		// 2 X 1 = 2
		// 2 X 1 = 4
		// .
		// .
		// .
		// 19단까지
		for(int i = 2; i < 20; i++ ) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
			System.out.println(i + " X " + j + " = " + (i*j));
		}
		System.out.println();
	}
}}
