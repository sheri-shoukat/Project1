
import java.util.PriorityQueue*;

class PriorityQueueDemo {
	
	// Main Method
	public static void main(String args[])
	{
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		System.out.println(pQueue.peek());

		
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}
