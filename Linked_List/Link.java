/*  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

 > Copyright (C) 2014 by Gurpreet Singh.
 > Link.java - The link class is used as an object or data item for the LL.
 > Because linked list(LL) have many links, it makes sense to use separate
 > class. Each object contains a ref to next link in list.  
 > Written by: Gurpreet Singh, 2014.

  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ */

public class Link<Type> {
	public Type dataField;					// data
	public Link<Type> nextLink;				// reference to next link

//........................................................................
	public Link(Type D) {
		dataField = D;						// initialize data
		nextLink = null;					// set next to null
	}
//........................................................................
	public void printLink() {
		System.out.println(dataField);
	}

//........................................................................	
}
