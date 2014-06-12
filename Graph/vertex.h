#ifndef VERTEX_H
#define VERTEX_H

#include <iostream>
#include <string>
using namespace std;

namespace Data_Structure {
	class Vertex {
	public:
		string LABEL;
		bool wasVisited;
		Vertex(string label);
		Vertex(){}
		void print();
	};
}

#endif