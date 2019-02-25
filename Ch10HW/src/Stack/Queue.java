package Stack;

public class Queue {
	
	int size;
	int[] elements;
	public static final int DEFAULT_CAPACITY = 8;
	
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	
	public Queue(int capacity) {
		elements = new int[capacity];
	}
	
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}
	
	public int dequeue() {
		return elements[--size];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
}


