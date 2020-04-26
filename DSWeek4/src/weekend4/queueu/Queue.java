package weekend4.queueu;

public class Queue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
		
	}
	
	public void show() {
		System.out.println("Elements: ");
		for(int i=0; i<size; i++) {
			System.out.println(queue[front + i] + " ");
		}
	}
	
	public int deQueue() {
		int data = queue[front];
		front++;
		size--;
		
		return data;
	}
	
	
	
}
