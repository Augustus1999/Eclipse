package Stack;

public class testqQueue {
	public static void main(String[] args) {
		
		int firstLoopCount = 1;
		int secondLoopCount = 0;
		Queue queue1 = new Queue();
		
		while (firstLoopCount < 21) {
			queue1.enqueue(firstLoopCount);
			firstLoopCount++;
		}
		
		while (secondLoopCount < 20) {
			System.out.println("Element " + (secondLoopCount+1) + " is equal to " + queue1.elements[secondLoopCount] + ".");
			queue1.dequeue();
			secondLoopCount++;
		}
		
	}
}