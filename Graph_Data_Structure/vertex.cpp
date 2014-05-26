#include "vertex.h"

namespace Data_Structure {
// 	........................................................
    Vertex::Vertex(string label) {
		LABEL = label;
		wasVisited = false;
	}
	
// 	........................................................
    void Vertex::print() {
		std::cout<< "Label " << LABEL;
	}
}