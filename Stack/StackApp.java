/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > StackApp.java - Test the Stack data structure
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

class StackApp {
//........................................................................
	public static void main(String args[]) throws Exception {
		Stack<Double> doubleStack = new Stack<Double>(5);	// create a stack of doubles
		doubleStack.push(10.0);								// add several elements to the stack
		doubleStack.push(20.0);
		doubleStack.push(30.0);
		doubleStack.push(40.0);
		doubleStack.push(50.0);
		
		while ( !(doubleStack.isEmpty()) ) {				// while the stack is not empty
			double x = doubleStack.pop();					// remove the top element
			System.out.print(x);							// display the removed element
			System.out.print(" ");
		}
		System.out.println("");
	}
//........................................................................
}
/* -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */
