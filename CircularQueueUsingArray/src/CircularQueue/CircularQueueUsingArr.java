package CircularQueue;

public class CircularQueueUsingArr {
	
	private int front,rear;
	private int[] queue;
	private int sizes;
	public CircularQueueUsingArr(int size) {
		front =-1 ;
		rear = front;
		sizes = size;
		queue = new int[sizes];
	}
	
	public boolean isEmpty() {
		return front==(rear+1)%sizes || front==-1;
	}
	public boolean isFull() {
        return (rear + 1) % sizes == front;
    }
	
	public void enqueue(int ele) {
		
		rear = (rear+1)%sizes;
		queue[rear] = ele;
		if(front==-1) {
			front = rear;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Empty queue!!!");
		}
		int ele = queue[front];
		if(front == rear) {
			front = rear =-1;
		}
		else {
			front = (front+1)%sizes;
			}
		
		
		return ele;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty!!!");
			return;
		}
		  int i = front;
	        do {
	            System.out.print(queue[i] + "->");
	            i = (i + 1) % sizes;
	        } while (i != (rear + 1) % sizes);
	        System.out.println();
	}
}
