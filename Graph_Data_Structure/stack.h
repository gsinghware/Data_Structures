#ifndef STACK_H
#define STACK_H

#include <iostream>
#include <string>
using namespace std;

namespace Data_Structure {
	template <class Item>
	class Stack {
	private:
		int size;
		int m_used;
		Item *stackArray;
	public:
		Stack(const int S);
		void push(const Item x);
		void pop();
		Item top() const;
		bool isEmpty() const {return (m_used == -1); }
	};
}

#include "stack.tpp"
#endif