package Chapter6_5;
/**
 * 
 * 	ť(Queue)
 *	FIFO(First In First Out)
 *	�����Ͱ� ó�� �� ���� ���� ���� ������ �ڷᱸ��
 *	�������� �߰� -> enQueue
 *	�������� ���� -> deQueue
 *
 */

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getQueueSize();
}