#include <iostream>
#include "vertex.h"
#include "graph.h"

using namespace std;
using namespace Data_Structure;

void testMST();

int main () {
	testMST();

	/*
	Graph a;
	a.addVertex("A");
	a.addVertex("B");
	a.addVertex("C");
	a.addVertex("D");

	a.addEdge(0,1);
	a.addEdge(0,2);
	a.addEdge(0,3);
	a.addEdge(1,3);

	a.displayMatrix();
	*/
}

void testMST() {
	Graph alphas;
	alphas.addVertex("A");
	alphas.addVertex("B");
	alphas.addVertex("C");
	alphas.addVertex("D");
	alphas.addVertex("E");

	alphas.addEdge(0, 1); // AB
	alphas.addEdge(0, 2); // AC
	alphas.addEdge(0, 3); // AD
	alphas.addEdge(0, 4); // AE
	alphas.addEdge(1, 2); // BC
	alphas.addEdge(1, 3); // BD
	alphas.addEdge(1, 4); // BE
	alphas.addEdge(2, 3); // CD
	alphas.addEdge(2, 4); // CE
	alphas.addEdge(3, 4); // DE

	std::cout<<"Graph Adjacency Matrix\n";
	alphas.displayMatrix();
	std::cout<<"\nThe Minimum Spanning Tree:\n";

	alphas.MST_DFS();	
}