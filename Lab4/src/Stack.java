/**
 * Stack.java
 * @author
 * @author
 */

import java.util.NoSuchElementException;


public class Stack<T> {
    private class Node {
        private T data;
        private Node next;
       
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
   
    private int length;
    private Node top;
   
    /****CONSTRUCTORS****/
   
    /**
     * Default constructor for the Stack class
     * @postcondition a new Stack object with all fields
     * assigned default values
     */
    public Stack() {
    	length = 0;
    	top = null;
    }
   
    /**
     * Copy constructor for the Stack class
     * @param original the Stack to copy
     * @postcondition a new Stack object which is
     * an identical, but distinct, copy of original
     */
    public Stack(Stack<T> original) {
    	if (original == null) {
			return;
		}
		if (original.length == 0) {
			length = 0;
			top = null;
		} else {
			Node N = original.top;
			Stack<T> tempStack = new Stack<>();
			while (N != null) {
				tempStack.push(N.data);
				N = N.next;
			}
			Node tempNode = tempStack.top;
			while(tempNode != null) {
				push(tempNode.data);
				tempNode = tempNode.next;
			}
		}
    }
   
    /****ACCESSORS****/
   
    /**
     * Returns the value stored at the top
     * of the Stack
     * @return the value at the top of the Stack
     * @precondition !isEmpty()
     * @throws NoSuchElementException when the
     * precondition is violated
     */
    public T peek() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException("peek(): The list is empty, cannot peek!");
		}
		return top.data;
    }
   
    /**
     * Returns the length of the Stack
     * @return the length from 0 to n
     */
    public int getLength() {
        return length;
    }
   
    /**
     * Determines whether a Stack is empty
     * @return whether the Stack is empty
     */
    public boolean isEmpty() {
        return length == 0;
    }
   
    /**
     * Determines whether two Stacks contain
     * the same values in the same order
     * @param Q the Stack to compare to this
     * @return whether Q and this are equal
     */
	@SuppressWarnings("unchecked")
    @Override 
    public boolean equals(Object o) {
		if(o == this) {
			return true;
		} else if(!(o instanceof Stack)) {
			return false;
		} else {
			Stack<T> S = (Stack<T>) o;
			if (this.length != S.length) {
				return false;
			} else {
				Node temp1 = this.top;
				Node temp2 = S.top;
				while (temp1 != null) { 
					if (!(temp1.data.equals(temp2.data))) {
						return false;
					}
					temp1 = temp1.next;
					temp2 = temp2.next;
				}
				return true;
			}
		}
	}
   
    /****MUTATORS****/
   
    /**
     * Inserts a new value at the top of
     * the Stack
     * @param data the new data to insert
     * @postcondition a new node at the end
     * of the Stack
     */
    public void push(T data) {
	   Node N = new Node(data);
	   N.next = top; //also works when top == null (i.e. an empty Stack)
	   top = N;
	   length++;

	}
   
    /**
     * Removes the top element of the Stack
     * @precondition !isEmpty()
     * @throws NoSuchElementException when
     * the precondition is violated
     * @postcondition the top element has
     * been removed
     */
    public void pop() throws NoSuchElementException{
    	if(isEmpty()) {
    		throw new NoSuchElementException("pop(): The list is empty, cannot pop!");
    	}
    	top = top.next;
    	length--;
    }
   
    /****ADDITONAL OPERATIONS****/
    
    
    /**
     * Prints in reverse order to the
     * console, followed by a new line
     * by calling the recursive helper
     * method printReverse
     */
    public void printReverse() {
       printReverse(top);
       System.out.println();
    }
   
    /**
     * Recursively prints to the console
     * the data in reverse order (no loops)
     * @param node the current node
     */

    private void printReverse(Node node) {
	   if(node.next != null) {
		   printReverse(node.next);
	   }
	   System.out.print(node.data + " ");
	}

   
    /**
     * Returns the values stored in the Stack
     * as a String, separated by a blank space
     * with a new line character at the end
     * @return a String of Stack values
     */
    @Override public String toString() {
        String result = "";
        Node N = top;
        while(N != null) {
        	result += N.data + " ";
        	N = N.next;
        }
        return result += "\n";
    }   
   
}


