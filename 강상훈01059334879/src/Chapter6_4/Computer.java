package Chapter6_4;

public abstract class Computer {
	//추상 메소드
	public abstract void display();
	public abstract void typing();
	//일반 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
