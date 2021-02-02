import java.util.NoSuchElementException;

public class QueueTest {
	public static void main(String[] args) {
		
		System.out.println("********************************** Testing Constructor\n");
		
		Queue<Integer> Q1 = new Queue<>();
		System.out.println("Should print an empty queue: " + Q1);
		
		Queue<Integer> Q2 = new Queue<>();
		System.out.println("Should print an empty queue: " + Q2);
		
		
		
		
		
		
		
		
		System.out.println("************************************* Testing enqueue()\n");
		
		Queue<Integer> Q3 = new Queue<>();
		Q3.enqueue(1);
		System.out.println("Should print 1: " + Q3);
		Q3.enqueue(2);
		Q3.enqueue(3);
		System.out.println("Should print 1 2 3: " + Q3);
		
		
		
		
		
		
		System.out.println("************************************* Testing getLength()\n");
		Queue<Integer> Q4 = new Queue<>();
		System.out.println("Should print 0: " + Q3.getLength());
		Q4.enqueue(1);
		Q4.enqueue(2);
		Q4.enqueue(3);
		System.out.println("Should print 3: " + Q3.getLength());
		System.out.println();

		
		
		
		System.out.println("************************************* Testing isEmpty()\n");
		Queue<Integer> Q5 = new Queue<>();
		System.out.println("Should print true: " + Q5.isEmpty());
		Q5.enqueue(1);
		Q5.enqueue(2);
		Q5.enqueue(3);
		System.out.println("Should print false: " + Q5.isEmpty());
		System.out.println();
		
		
		
		
		
		
		System.out.println("************************************* Testing dequeue()\n");
		Queue<Integer> Q6 = new Queue<>();
		try {
			Q6.dequeue();
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Q6.enqueue(1);
		Q6.enqueue(2);
		Q6.enqueue(3);
		Q6.dequeue();
		System.out.println("Should print 2 3: " + Q6);

		
		
		
		
		System.out.println("******************************************************");
	}
}
