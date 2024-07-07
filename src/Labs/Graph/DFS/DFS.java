package Labs.Graph.DFS;

// Class for stack operations
class StackX {
    private final int SIZE = 20;  // Stack size
    private int[] st;  // Array for stack elements
    private int top;  // Top of stack

    // Constructor to initialize stack
    public StackX() {
        st = new int[SIZE];
        top = -1;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int j) {
        st[++top] = j;
    }

    // Pop an element from the stack
    public int pop() {
        return st[top--];
    }

    // Peek at the top element of the stack
    public int peek() {
        return st[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
}

// Class representing a link in the adjacency list
class Link3 {
    public int vertexId;  // Vertex id
    public Labs.Graph.DFS.Link3 next;  // Next link in the list

    // Constructor to initialize the link
    public Link3(int vertexId) {
        this.vertexId = vertexId;
        this.next = null;
    }
}

// Class representing the adjacency list
class LinkList3 {
    private Labs.Graph.DFS.Link3 first;  // Reference to the first link in the list

    // Constructor to initialize the adjacency list
    public LinkList3() {
        first = null;
    }

    // Insert a link at the beginning of the list
    public void insertFirst(int vertexId) {
        Labs.Graph.DFS.Link3 newLink = new Labs.Graph.DFS.Link3(vertexId);
        newLink.next = first;
        first = newLink;
    }

    // Find an unvisited vertex in the adjacency list
    public int findUnvisitedVertex(Labs.Graph.DFS.Vertex3[] vertexList) {
        Labs.Graph.DFS.Link3 current = first;
        while (current != null) {
            int vertexId = current.vertexId;
            if (!vertexList[vertexId].wasVisited) {
                return vertexId;
            }
            current = current.next;
        }
        return -1;  // No unvisited vertices found
    }
}

// Class representing a vertex in the graph
class Vertex3 {
    public char label;  // Vertex label (e.g., 'A', 'B')
    public boolean wasVisited;  // Flag indicating if the vertex was visited
    public Labs.Graph.DFS.LinkList3 adjacencyList;  // Adjacency list for the vertex

    // Constructor to initialize the vertex
    public Vertex3(char lab) {
        label = lab;
        wasVisited = false;
        adjacencyList = new Labs.Graph.DFS.LinkList3();
    }
}

// Class representing the graph
class Graph3 {
    private final int MAX_VERTS = 20;  // Maximum number of vertices
    private Labs.Graph.DFS.Vertex3[] vertexList;  // Array of vertices
    private int nVerts;  // Current number of vertices
    private Labs.Graph.DFS.StackX theStack;  // Stack for DFS

    // Constructor to initialize the graph
    public Graph3() {
        vertexList = new Labs.Graph.DFS.Vertex3[MAX_VERTS];
        nVerts = 0;
        theStack = new Labs.Graph.DFS.StackX();
    }

    // Add a vertex to the graph
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Labs.Graph.DFS.Vertex3(lab);
    }

    // Add an edge between two vertices
    public void addEdge(int start, int end) {
        vertexList[start].adjacencyList.insertFirst(end);
        vertexList[end].adjacencyList.insertFirst(start);
    }

    // Display a vertex
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    // Depth-First Search (DFS) algorithm
    public void dfs() {
        vertexList[0].wasVisited = true;  // Start with vertex 0
        displayVertex(0);  // Display it
        theStack.push(0);  // Push it onto the stack

        while (!theStack.isEmpty()) {
            int currentVertex = theStack.peek();
            int unvisitedVertex = getAdjUnvisitedVertex(currentVertex);

            if (unvisitedVertex == -1) {  // No adjacent unvisited vertex
                theStack.pop();
            } else {  // Found an unvisited vertex
                vertexList[unvisitedVertex].wasVisited = true;
                displayVertex(unvisitedVertex);
                theStack.push(unvisitedVertex);
            }
        }

        // Reset the visited flags
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }

    // Get an adjacent unvisited vertex
    public int getAdjUnvisitedVertex(int v) {
        return vertexList[v].adjacencyList.findUnvisitedVertex(vertexList);
    }
}

// Main class to test the DFS implementation
class DFSApp3 {
    public static void main(String[] args) {
        Labs.Graph.DFS.Graph3 theGraph = new Labs.Graph.DFS.Graph3();
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();
    }
}
