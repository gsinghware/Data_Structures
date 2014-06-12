#ifndef GRAPH_H
#define GRAPH_H

#include <iostream>
#include <string>
#include "vertex.h"
#include "stack.h"
using namespace std;

namespace Data_Structure {
	class Graph {
		static const std::size_t MAX_VERTS = 30;
	private:
		Vertex *vertexList;				// array of vertices
		int **adjMatrix;				// adjacency matrix
		int nVerts;						// number of vertices
		Stack<int> *intStack;

	public:
		Graph();
		void addVertex(const string lab);
		void addEdge(const int start, const int end);
		void displayVertex(const int v);
		void displayMatrix();

		void MST_DFS();
		int getAdjUnvistedVertex(const int vertex);
	};
}

#endif