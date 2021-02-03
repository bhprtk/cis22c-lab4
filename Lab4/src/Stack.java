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
    public Stack(Stack<T> original) {}
   
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

       return null;

    }
   
    /**
     * Returns the length of the Stack
     * @return the length from 0 to n
     */
    public int getLength() {
        return -1;
    }
   
    /**
     * Determines whether a Stack is empty
     * @return whether the Stack is emtpy
     */
    public boolean isEmpty() {
        return false;
    }
   
    /**
     * Determines whether two Stacks contain
     * the same values in the same order
     * @param Q the Stack to compare to this
     * @return whether Q and this are equal
     */
    @Override public boolean equals(Object o) {

        return false;

    }
   
    /****MUTATORS****/
   
    /**
     * Inserts a new value at the top of
     * the Stack
     * @param data the new data to insert
     * @postcondition a new node at the end
     * of the Stack
     */
    public void push(T data) {}
   
    /**
     * Removes the top element of the Stack
     * @precondition !isEmpty()
     * @throws NoSuchElementException when
     * the precondition is violated
     * @postcondition the top element has
     * been removed
     */
    public void pop() throws NoSuchElementException{}
   
    /****ADDITONAL OPERATIONS****/
   
    /**
     * Returns the values stored in the Stack
     * as a String, separated by a blank space
     * with a new line character at the end
     * @return a String of Stack values
     */
    @Override public String toString() {
        String result = "";
        result += "\n";
        return result;
    }   
   
}


