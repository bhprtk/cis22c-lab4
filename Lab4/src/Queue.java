/**
 * Queue.java
 * @author Pratik Bhandari
 * @author Naqib Khan
 */

import java.util.NoSuchElementException;


public class Queue<T> {
    private class Node {
        private T data;
        private Node next;
       
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
   
    private int length;
    private Node front;
    private Node end;
   
    /************************************************************************* CONSTRUCTORS **/
   
    /**
     * Default constructor for the Queue class
     * @postcondition a new Queue object with all fields
     * assigned default values
     */
    public Queue() {
    	length = 0;
    	front = end = null;
    }
   
    /**
     * Copy constructor for the Queue class
     * @param original the Queue to copy
     * @postcondition a new Queue object which is
     * an identical, but distinct, copy of original
     */
    public Queue(Queue<T> original) {
//    	if(original == null) {
//    		return;
//    	}
//    	if(original.length == 0) {
//    		length = 0;
//    		front = end = null;
//    	} else {
//    		Node N = original.front;
//    		while(N != null) {
//    			
//    		}
//    	}
    }
   
    /********************************************************************** ACCESSORS **/
   
    /**
     * Returns the value stored at the front
     * of the Queue
     * @return the value at the front of the queue
     * @precondition !isEmpty()
     * @throws NoSuchElementException when the
     * precondition is violated
     */
    public T getFront() throws NoSuchElementException {
        return null;
    }
   
    /**
     * Returns the length of the Queue
     * @return the length from 0 to n
     */
    public int getLength() {
        return -1;
    }
   
    /**
     * Determines whether a Queue is empty
     * @return whether the Queue is empty
     */
    public boolean isEmpty() {
        return false;
    }
   
    /**
     * Determines whether two Queues contain
     * the same values in the same order
     * @param o the Object to compare to this
     * @return whether o and this are equal
     */
    @Override public boolean equals(Object o) {
        return false;
    }
   
    /********************************************************************** MUTATORS **/   
    /**
     * Inserts a new value at the end of
     * the Queue
     * @param data the new data to insert
     * @postcondition a new node at the end
     * of the Queue
     */
    public void enqueue(T data) {
	   if (length == 0) { //edge case
	      front = end = new Node(data);
	   } else { //general case
	      end.next = new Node(data);
	      end = end.next;
	   }
	   length++;
	}
   
    /**
     * Removes the front element in the Queue
     * @precondition !isEmpty()
     * @throws NoSuchElementException when
     * the precondition is violated
     * @postcondition the front element has
     * been removed
     */
    public void dequeue() throws NoSuchElementException {}
    
    /********************************************************************** ADDITONAL OPERATIONS **/
   
   
    /**
     * Returns the values stored in the Queue
     * as a String, separated by a blank space
     * with a new line character at the end
     * @return a String of Queue values
     */
    @Override public String toString() {
        String result = "";
        Node N = front;
        while(N != null) {
        	result += N.data + " ";
        	N = N.next;
        }
        return result += "\n";
    }   
   
}