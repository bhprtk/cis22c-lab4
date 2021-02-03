
/**
 * StackTest.java
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
		
		
		
		
		
		System.out.println("******************************************************");

	}
}
