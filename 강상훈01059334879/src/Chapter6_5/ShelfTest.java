package Chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfs = new BookShelf();
		shelfs.push("자바 프로그래밍");
		shelfs.push("명품 자바");
		shelfs.push("자바의 정석");
		shelfs.push("Do it 자바 입문");
		shelfs.push("java");
		
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		
		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("자바 프로그래밍");
		shelfQ.enQueue("명품 자바");
		shelfQ.enQueue("자바의 정석");
		shelfQ.enQueue("Do it 자바 입문");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());


	}

}
