#include "stack.h"
#include <cassert>  // provides assert

namespace Data_Structure {
// 	........................................................
	template <class Item>
    Stack<Item>::Stack(const int x) {
    	size = x;
    	m_used = -1;
    	stackArray = new Item[x];
	}
	
// 	........................................................
    template <class Item>
    void Stack<Item>::push(const Item x) {
    	assert(m_used < size);
    	m_used++;
    	stackArray[m_used] = x;
	}
 
// 	........................................................
    template <class Item>
    void Stack<Item>::pop() {
    	assert(!isEmpty());
    	m_used--;
	}

// 	........................................................
    template <class Item>
    Item Stack<Item>::top() const {
    	assert(!isEmpty());
    	return stackArray[m_used];
	}
}