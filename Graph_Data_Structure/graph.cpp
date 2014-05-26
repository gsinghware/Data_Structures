#include "graph.h"

namespace Data_Structure {

// 	........................................................
    Graph::Graph() {
    	adjMatrix = new int*[MAX_VERTS];
    	for(int i = 0; i < MAX_VERTS; ++i)
    		adjMatrix[i] = new int[MAX_VERTS];

    	vertexList = new Vertex;
    	nVerts = 0;

    	for (int i = 0; i < MAX_VERTS; i++)
    		for (int j = 0; j < MAX_VERTS; j++)
    			adjMatrix[i][j] = 0;

    	intStack = new Stack<int>(MAX_VERTS);
	}

// 	........................................................
	void Graph::addVertex(const string lab) {
		Vertex X(lab);
		vertexList[nVerts] = X;
		nVerts++;
	}

// 	........................................................
	void Graph::addEdge(const int start, const int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

// 	........................................................
	void Graph::displayVertex(const int v) {
		std::cout<<vertexList[v].LABEL <<endl;
	}

// 	........................................................
	void Graph::displayMatrix() {
		for (int i = 0; i < nVerts; i++)
			std::cout<<"\t" <<vertexList[i].LABEL;
		cout <<"\n";
		for (int i = 0; i < nVerts; i++) {
			std::cout<<vertexList[i].LABEL <<"\t";
			for (int j = 0; j < nVerts; j++)
				std::cout<<adjMatrix[i][j] <<"\t";
			std::cout<<"\n";
		}
	}

// 	........................................................
	void Graph::MST_DFS() {
		vertexList[0].wasVisited = true;	// start at 0
		intStack->push(0);					// push it to stack
		while (! (intStack->isEmpty()) ) {
			int currentVertex = intStack->top();
			int v = getAdjUnvistedVertex(currentVertex);
			if (v == -1)
				intStack->pop();
			else {
				vertexList[v].wasVisited = true;
				intStack->push(v);
				displayVertex(currentVertex);
				displayVertex(v);
			}
		}

		// reset the graph as original
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}
	}

// 	........................................................
	int Graph::getAdjUnvistedVertex(const int vertex) {
		for (int i = 0; i < nVerts; i++)
			if(adjMatrix[vertex][i] == 1 && (vertexList[i].wasVisited == false))
				return i;
		return -1;
	}
}





