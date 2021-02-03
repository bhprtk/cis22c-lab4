
/**
 * QueueTest.java
 * @author Naqib Khan
 * @author Pratik Bhandari
 */

import java.util.NoSuchElementException;

public class QueueTest {
	public static void main(String[] args) {

		System.out.println("********************************** Test(1) Constructor\n");

		Queue<Integer> Q1 = new Queue<>();
		System.out.println("Should print an empty queue: " + Q1);

		Queue<Integer> anotherQ1 = new Queue<>();
		System.out.println("Should print an empty queue: " + anotherQ1);

		System.out.println("************************************* Test(2) toString()\n");
		Queue<Integer> Q2 = new Queue<>();
		System.out.println("Should print an empty queue: " + Q2.toString());

		Q2.enqueue(1);
		Q2.enqueue(2);
		Q2.enqueue(3);
		System.out.println("Should print 1 2 3: " + Q2.toString());

		System.out.println("************************************* Test(3) enqueue()\n");

		Queue<Integer> Q3 = new Queue<>();
		Q3.enqueue(1);
		System.out.println("Should print 1: " + Q3);
		Q3.enqueue(2);
		Q3.enqueue(3);
		System.out.println("Should print 1 2 3: " + Q3);

		System.out.println("************************************* Test(4) getLength()\n");
		Queue<Integer> Q4 = new Queue<>();
		System.out.println("Should print 0: " + Q3.getLength());
		Q4.enqueue(1);
		Q4.enqueue(2);
		Q4.enqueue(3);
		System.out.println("Should print 3: " + Q3.getLength());
		System.out.println();

		System.out.println("************************************* Test(5) isEmpty()\n");
		Queue<Integer> Q5 = new Queue<>();
		System.out.println("Should print true: " + Q5.isEmpty());
		Q5.enqueue(1);
		Q5.enqueue(2);
		Q5.enqueue(3);
		System.out.println("Should print false: " + Q5.isEmpty());
		System.out.println();

		System.out.println("************************************* Test(6) dequeue()\n");
		Queue<Integer> Q6 = new Queue<>();
		try {
			Q6.dequeue();
		} catch (NoSuchElementException e) {
			System.out.println("Should print error: " + e.getMessage());
		}
		Q6.enqueue(1);
		Q6.enqueue(2);
		Q6.enqueue(3);
		Q6.dequeue();
		System.out.println("Should print 2 3: " + Q6);

		System.out.println("************************************* Test(7) getFront()\n");
		Queue<Integer> Q7 = new Queue<>();
		try {
			Q7.getFront();
		} catch (NoSuchElementException e) {
			System.out.println("Should print error: " + e.getMessage());
		}
		Q7.enqueue(1);
		Q7.enqueue(2);
		Q7.enqueue(3);
		System.out.println("Should print 1: " + Q7.getFront());
		System.out.println();

		System.out.println("************************************* Test(8) equals()\n");
		Queue<Integer> Q8 = new Queue<>();
		Queue<Integer> Q8copy = new Queue<>();

		Q8.enqueue(1);
		Q8.enqueue(2);
		Q8.enqueue(3);

		Q8copy.enqueue(0);
		Q8copy.enqueue(1);
		Q8copy.enqueue(2);
		System.out.println("Should print false: " + Q8.equals(Q8copy));
		Q8copy.dequeue();
		Q8copy.enqueue(3);
		System.out.println("Should print true: " + Q8.equals(Q8copy));
		System.out.println();

		System.out.println("************************************* Test(9) Copy Constructor\n");
		Queue<Integer> Q9 = new Queue<>();
		Queue<Integer> Q9copy = new Queue<>(Q9);

		System.out.println("Should print true: " + Q9.equals(Q9copy));
		Q9.enqueue(1);
		Q9.enqueue(2);
		Q9.enqueue(3);

		System.out.println("Should print false: " + Q9.equals(Q9copy));

		Queue<Integer> Q9copy2 = new Queue<>(Q9);

		System.out.println("Should print true: " + Q9.equals(Q9copy2));
		System.out.println("Should print 1 2 3: " + Q9copy2);

		System.out.println("************************************* Test(10) printReverse()\n");
		Queue<Integer> Q10 = new Queue<>();
		Q10.enqueue(1);
		Q10.enqueue(2);
		Q10.enqueue(3);
		System.out.print("Should print 3 2 1: ");
		Q10.printReverse();
		Q10.enqueue(4);
		Q10.enqueue(5);
		Q10.enqueue(6);
		Q10.enqueue(7);
		System.out.print("Should print 7 6 5 4 3 2 1: ");
		Q10.printReverse();
		System.out.println();

		System.out.println("************************************* Test(11) isSorted()\n");

		Queue<Integer> Q11 = new Queue<>();
		System.out.println("Should print true: " + Q11.isSorted());

		Q11.enqueue(1);
		System.out.println("Should print true: " + Q11.isSorted());

		Q11.enqueue(2);
		Q11.enqueue(3);
		Q11.enqueue(4);
		System.out.println("Should print true: " + Q11.isSorted());
		Q11.enqueue(9);
		Q11.enqueue(7);
		Q11.enqueue(8);

		System.out.println("Should print false: " + Q11.isSorted());

		System.out.println();

		System.out.println("************************************* Test(12) linearSearch()\n");
		Queue<String> Q12 = new Queue<>();
		System.out.println("Should print -1: " + Q12.linearSearch("tomato"));
		Q12.enqueue("tomato");
		Q12.enqueue("pickle");
		Q12.enqueue("ketchup");
		Q12.enqueue("lettuce");
		Q12.enqueue("mayo");

		System.out.println("Should print 0: " + Q12.linearSearch("tomato"));
		System.out.println("Should print 2: " + Q12.linearSearch("ketchup"));
		System.out.println("Should print -1: " + Q12.linearSearch("fries"));
		System.out.println();

		System.out.println("******************************************************");
	}
}
