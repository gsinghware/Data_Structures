/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > LinkedList.java - In Linked List data structure, each data item is 
 > embedded in a link. Each link contains a data field and a link to the
 > next data item. 
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

public class LinkedList<Type> {
	private Link<Type> first;						// beginning of the list
	
//........................................................................
	public LinkedList () {
		first = null;								// indicates an empty list
	}
	
//........................................................................
	public void insertFirst(Type X) {				// insert to the front of the list
		Link<Type> newLink = new Link<Type>(X);				// create a new link
		newLink.nextLink = first;					// set the nextLink to the first link
		first = newLink;							// set first to newLink
	}
	
//........................................................................
	public Link<Type> deleteFirst() { 				// delete from the front of the list
		Link<Type> temp = first;					// save reference to link
		first = first.nextLink;						// delete it, set first link to nextLink
		return temp;								// return deleted link
	}
	
//........................................................................
	public void printLL() {							// print the LL
		System.out.println("List (first-->last): ");
		Link<Type> current = first;					// start at the beginning of the list
		while(current != null) {					// until the end of the list
			current.printLink();					// print the link
			current = current.nextLink;				// move to the next link
		}
		System.out.println("");
	}

//........................................................................
	public boolean isEmpty() {							// return true if list is empty
		return (first == null);
	}

}