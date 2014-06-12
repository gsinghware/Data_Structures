/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > TestApp.java - Test all the data structure
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

class TestApp {
//........................................................................
	public static void main(String args[]) throws Exception {
		System.out.println("Testing the Stack Data Structure");
		Stack<Double> doubleStack = new Stack<Double>(5);	// create a stack of doubles
		doubleStack.push(10.0);								// add several elements to the stack
		doubleStack.push(20.0);
		doubleStack.push(30.0);
		doubleStack.push(40.0);
		doubleStack.push(50.0);
		
		while ( !(doubleStack.isEmpty()) ) {				// while the stack is not empty
			double a = doubleStack.pop();					// remove the top element
			System.out.print(a);							// display the removed element
			System.out.print(" ");
		}
		System.out.println("\n");
		
		System.out.println("Testing the Queue Data Structure");
		Queue<Double> doubleQueue = new Queue<Double>(5);
		doubleQueue.insert(10.0);							// add several elements to the queue
		doubleQueue.insert(20.0);
		doubleQueue.insert(30.0);
		doubleQueue.insert(40.0);
		doubleQueue.insert(50.0);
		
		while ( !(doubleQueue.isEmpty()) ) {				// while the queue is not empty
			double b = doubleQueue.remove();				// remove the top element
			System.out.print(b);							// display the removed element
			System.out.print(" ");
		}
		System.out.println("");
	}
//........................................................................
}
/* -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */
