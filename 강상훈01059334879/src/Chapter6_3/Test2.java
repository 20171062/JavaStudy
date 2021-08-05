package Chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		
		// 여기에는 super(); <- 부모클래스 생략이 되어있음.
		
		super("null");
		System.out.println("자식1 클래스");
		
		
		
	}
	
	//에노테이션(어노테이션)
@Override
	public void add() {
		System.out.println("세 수를 더합니다.");
		super.add();
	}
	public void sub() {
		System.out.println("세 수를 뺍니다.");
	}

}