package Chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		
		// ���⿡�� super(); <- �θ�Ŭ���� ������ �Ǿ�����.
		
		super("null");
		System.out.println("�ڽ�1 Ŭ����");
		
		
		
	}
	
	//�������̼�(������̼�)
@Override
	public void add() {
		System.out.println("�� ���� ���մϴ�.");
		super.add();
	}
	public void sub() {
		System.out.println("�� ���� ���ϴ�.");
	}

}