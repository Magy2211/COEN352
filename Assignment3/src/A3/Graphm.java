package A3;

/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/
import java.lang.String; 
import A3.AStack; 
import A3.ADTStack;

class Graphm implements Graph { // Graph: Adjacency matrix
  private int[][] matrix;                // The edge matrix
  private int numEdge;                   // Number of edges
  public int[] Mark;                     // The mark array
  public int[] Count;
  
  
  public Graphm() {}
  public Graphm(int n) {                 // Constructor
    Init(n);
  }

  public void Init(int n) {
    Mark = new int[n];
    Count = new int[n];
    matrix = new int[n][n];
    numEdge = 0;
  }

  public int n() { return Mark.length; } // # of vertices

  public int e() { return numEdge; }     // # of edges

  public int first(int v) { // Get v's first neighbor
    for (int i=0; i<Mark.length; i++)
      if (matrix[v][i] != 0) return i;
    return Mark.length;  // No edge for this vertex
  }

  public int next(int v, int w) { // Get v's next edge
    for (int i=w+1; i<Mark.length; i++)
      if (matrix[v][i] != 0)
        return i;
    return Mark.length;  // No next edge;
  }

  public boolean isEdge(int i, int j) // Is (i, j) an edge?
    { return matrix[i][j] != 0; }
 
  
  // Set edge weight
  public void setEdge(int i, int j, int wt) {
    assert wt!= 0 : "Cannot set weight to 0";
    if (matrix[i][j] == 0) numEdge++;
    matrix[i][j] = wt;
  }

  public void delEdge(int i, int j) { // Delete edge (i, j)
    if (matrix[i][j] != 0) {
      matrix[i][j] = 0;
      numEdge--;
    }
  }

  public int weight(int i, int j) { // Return edge weight
    if (i == j) return 0;
    if (matrix[i][j] == 0) return Integer.MAX_VALUE;
    return matrix[i][j];
  }

 // Get and set marks
  public void setMark(int v, int val) { Mark[v] = val; }
  public int getMark(int v) { return Mark[v]; }
  
  public int incrCount(int w) {return ++Count[w];}
  
  
  //using DFS 
  public String getPrerequisitePath(String courseCode) 
  {
	  ADTStack<String> stack = new AStack<String>(100);
	  
	  String Path;
	  int prerequisitesCount = 0; 
	  
	  int Index = getIndex(courseCode);
	  
	  if(getIndex(courseCode) != -1)
	  {
		 stack.push(courseCode); 
		 
		 while(stack.length() > 0) {
				String v = stack.topValue();
				stack.pop();
				setMark(v, VISITED);
				int temp = v; 
				for (int w = first(temp); w < 100; w = next(temp,w)) {
				    if (getMark(w) == UNVISITED) { // Put next to stack
				    	
				    	stack.push(w);
				    	setMark(w, VISITED);
				    	
				    	int k = first(w); 
				    	while(k<100) {
				    		 if (getMark(k) == UNVISITED) {
				    			 setMark(k, VISITED);
				    			 stack.push(k);
				    			 temp = k;
				    			 break;
				    		 }
				    		 k = next(w, k);
				    	}
				    }
				 }	 
		 }
		 Path = stack.toString(); 
	  }
	  
  }
}
