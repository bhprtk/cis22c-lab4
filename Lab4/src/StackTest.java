import java.util.NoSuchElementException;

/**
 * StackTest.java
 * 
 * @author Naqib Khan
 * @author Pratik Bhandari
 */

public class StackTest {
	public static void main(String[] args) {
		System.out.println("********************************** Test(1) Constructor\n");
		Stack<Integer> S1 = new Stack<>();
		System.out.println("Should print an empty stack: " + S1);

		Queue<Integer> anotherS1 = new Queue<>();
		System.out.println("Should print an empty stack: " + anotherS1);

		System.out.println("************************************* Test(2) toString()\n");
		Stack<Integer> S2 = new Stack<>();
		S2.push(1);
		System.out.println("Should print 1: " + S2);
		S2.push(2);
		S2.push(3);
		System.out.println("Should print 3 2 1: " + S2);

		System.out.println("************************************* Test(3) push()\n");
		Stack<Integer> S3 = new Stack<>();
		S3.push(1);
		System.out.println("Should print 1: " + S3);
		S3.push(2);
		S3.push(3);
		System.out.println("Should print 3 2 1: " + S3);

		System.out.println("************************************* Test(4) getLength()\n");
		Stack<Integer> S4 = new Stack<>();
		System.out.println("Should print 0: " + S4.getLength());
		S4.push(1);
		S4.push(2);
		S4.push(3);
		System.out.println("Should print 3: " + S4.getLength());
		System.out.println();

		System.out.println("************************************* Test(5) isEmpty()\n");

		Stack<Integer> S5 = new Stack<>();
		System.out.println("Should print true: " + S5.isEmpty());
		S5.push(1);
		S5.push(2);
		S5.push(3);
		System.out.println("Should print false: " + S5.isEmpty());
		System.out.println();

		System.out.println("************************************* Test(6) pop()\n");

		Stack<Integer> S6 = new Stack<>();
		try {
			S6.pop();
		} catch (NoSuchElementException e) {
			System.out.println("Should print error: " + e.getMessage());
		}

		S6.push(1);
		S6.push(2);
		S6.push(3);
		S6.pop();
		System.out.println("Should print 2 1: " + S6);
		System.out.println("Should print 2: " + S6.getLength());
		System.out.println();

		System.out.println("************************************* Test(7) peek()\n");
		Stack<Integer> S7 = new Stack<>();

		try {
			S7.peek();
		} catch (NoSuchElementException e) {
			System.out.println("Should print error: " + e.getMessage());
		}

		S7.push(1);
		S7.push(2);
		S7.push(3);
		System.out.println("Should print 3: " + S7.peek());
		System.out.println();

		System.out.println("************************************* Test(8) equals()\n");
		Stack<Integer> S8 = new Stack<>();
		Stack<Integer> S8copy = new Stack<>();

		S8.push(1);
		S8.push(2);
		S8.push(3);

		S8copy.push(1);
		S8copy.push(2);
		S8copy.push(2);

		System.out.println("Should print false: " + S8.equals(S8copy));
		S8copy.pop();
		S8copy.push(3);
		System.out.println("Should print true: " + S8.equals(S8copy));
		System.out.println();

		System.out.println("************************************* Test(9) Copy Constructor()\n");
		Stack<Integer> S9 = new Stack<>();
		Stack<Integer> S9copy = new Stack<>(S9);
		System.out.println("Should print true: " + S9.equals(S9copy));
		S9.push(1);
		S9.push(2);
		S9.push(3);
		System.out.println("Should print false: " + S9.equals(S9copy));

		Stack<Integer> S9copy2 = new Stack<>(S9);

		System.out.println("Should print true: " + S9.equals(S9copy2));

		System.out.println("Should print 3 2 1: " + S9copy2);

		System.out.println("************************************* Test(10) printReverse()\n");
		Stack<Integer> S10 = new Stack<>();
		S10.push(1);
		S10.push(2);
		S10.push(3);
		System.out.print("Should print 1 2 3: ");
		S10.printReverse();
		S10.push(4);
		S10.push(5);
		S10.push(6);
		S10.push(7);
		System.out.print("Should print 1 2 3 4 5 6 7: ");
		S10.printReverse();
		System.out.println();

		System.out.println("************************************* Test(11) isSorted()\n");
		Stack<Integer> S11 = new Stack<>();
		System.out.println("Should print true: " + S11.isSorted());

		S11.push(1);
		System.out.println("Should print true: " + S11.isSorted());

		S11.push(2);
		System.out.println("Should print false: " + S11.isSorted());

		S11.pop();
		S11.pop();
		S11.push(3);
		S11.push(2);
		S11.push(1);
		System.out.println("Should print true: " + S11.isSorted());
		System.out.println();

		System.out.println("************************************* Test(12) linearSearch()\n");
		Stack<String> S12 = new Stack<>();
		System.out.println("Should print -1: " + S12.linearSearch("tomato"));
		S12.push("tomato");
		S12.push("pickle");
		S12.push("ketchup");
		S12.push("lettuce");
		S12.push("mayo");

		System.out.println("Should print 5: " + S12.linearSearch("tomato"));
		System.out.println("Should print 3: " + S12.linearSearch("ketchup"));
		System.out.println("Should print -1: " + S12.linearSearch("fries"));
		System.out.println();

		System.out.println("****************************************************** End of StackTest");

	}
}
