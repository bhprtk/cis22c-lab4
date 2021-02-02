
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
		
		
		
		
		
		
		System.out.println("************************************* Testing enqueue()\n");
		Queue<Integer> Q4 = new Queue<>();
		System.out.println("Should print 0: " + Q3.getLength());
		Q4.enqueue(1);
		Q4.enqueue(2);
		Q4.enqueue(3);
		System.out.println("Should print 3: " + Q3.getLength());


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n******************************************************");
	}
}
