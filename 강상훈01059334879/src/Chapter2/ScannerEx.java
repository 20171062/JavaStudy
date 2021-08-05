package Chapter2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String name;
		Scanner hi;
		hi = new Scanner(System.in);
		name = hi.nextLine();
		
		System.out.println(name);
	}

}
