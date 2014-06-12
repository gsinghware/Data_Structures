/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > Stack.java - Stack data structure allows access to only the last item.
 > You can access the next-to-last item by removing or popping the stack.
 > You can push onto the stack, review the top of the stack, see if the
 > stack is full or empty.
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

class Stack<Type> {
	private int maxSize;							// size of stack [array]
	private int top;								// top of stack
	private Type[] stackArray;						// stack of elements
	
//.........................................................................
	public Stack() { this(5); }						// default constructor set default size to 5
	
//.........................................................................	
	@SuppressWarnings("unchecked")
	public Stack(int size) {						// parameterized constructor
		maxSize = size > 0 ? size : 5;				// if size < 0, then size is 5 else size
		top = -1;									// no items on the stack yet
		stackArray = (Type[]) new Object[maxSize];	// create array of <Type>
	}

//.........................................................................
	public void push(Type X) throws Exception {		// add an item to the stack
		if (isFull()) 								// if stack is full
		      throw new Exception(String.format("Stack is full, cannot push %s", X));
		stackArray[++top] = X;						// increment top and insert item
	}

//.........................................................................
	public Type pop() throws Exception {			// remove top item from the stack
		if(isEmpty())								// if stack is empty
			throw new Exception("Stack is empty, cannot pop");
		return stackArray[top--];					// return top item and decrement top
	}

//.........................................................................	
	public Type top() {								// returns the top of the stack
		return stackArray[top];	
	}
	
//.........................................................................	
	public boolean isEmpty() {						// true if stack is empty
		return (top == -1);
	}
	
//.........................................................................	
	public boolean isFull() {
		return (top == maxSize - 1);				// true if stack is full
	}
//.........................................................................	
}

/* -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */
