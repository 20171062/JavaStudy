package Chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfs = new BookShelf();
		shelfs.push("�ڹ� ���α׷���");
		shelfs.push("��ǰ �ڹ�");
		shelfs.push("�ڹ��� ����");
		shelfs.push("Do it �ڹ� �Թ�");
		shelfs.push("java");
		
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		System.out.println(shelfs.getStackSize() + " - " + shelfs.pop());
		
		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("�ڹ� ���α׷���");
		shelfQ.enQueue("��ǰ �ڹ�");
		shelfQ.enQueue("�ڹ��� ����");
		shelfQ.enQueue("Do it �ڹ� �Թ�");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());


	}

}
