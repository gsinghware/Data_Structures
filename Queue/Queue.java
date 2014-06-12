/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > Queue.java - Queue data structure is similar to stack except that in a
 > queue the first item inserted is the first to be removed.
 > This queue is implemented by keeping an item count.
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

class Queue<Type> {
	private int maxSize;							// size of stack [array]
	private Type[] queueArray;						// queue of elements
	private int rear, front;						// keep track of the front and end index
	private int nItems;								// num of items in queue

//........................................................................
	@SuppressWarnings("unchecked")
	public Queue (int size) {						// constructor
		maxSize = size;								// size of queue
		queueArray = (Type[]) new Object[maxSize];	// create an array for queue
		front = 0;									// the last element is 0 in empty queue
		rear = -1;									// the first element is -1 in empty queue
		nItems = 0;									// start with 0 item
	}

//........................................................................
	public void insert (Type X) throws Exception { 	// insert an item at the rear of queue
		if (isFull())  								// if stack is full
			throw new Exception(String.format("Queue is full, cannot insert %s", X));
		else if (rear == maxSize - 1) 				// deal with the wrap around
			rear = -1;								// start at the beginning again
		queueArray[++rear] = X;						// increment and insert item in array
		nItems++;									// increment num of items
	}

//........................................................................
	public Type remove() throws Exception {			// take item from the front of the queue
		if (isEmpty())
			throw new Exception(String.format("Queue is empty, cannot remove"));
		Type X = queueArray[front++];				// get value and increment front
		if (front == maxSize)						// deal with wrap around
			front = 0;								// start at the beginning again
		nItems--;									// one less item
		return X;									// return the item removed
	}
	
//........................................................................
	public Type front() {							// return the elem in front of the queue
		return (queueArray[front]);
	}
	
//........................................................................
	public boolean isFull() {						// true if queue is empty
		return (nItems == maxSize);
	}
	
//........................................................................
	public boolean isEmpty()  {						// true if queue is full
		return (nItems == 0);
	}
	
//........................................................................
	public int size() {								// return num of items in queue
		return nItems;
	}

//........................................................................
}
