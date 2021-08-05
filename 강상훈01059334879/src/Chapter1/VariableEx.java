package Chapter1;

public class VariableEx {

	public static void main(String[] args) {
		double level; //4바이트 정수를 담을 수 있는 level변수 선언
		level = 500; // level변수에 10이라는 정수를 대입(초기화)
		level = level + 10.5;

		int two;
		two = 300;
		
		System.out.println(level+two);
	}

}