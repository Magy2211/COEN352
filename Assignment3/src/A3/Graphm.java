package A3;

/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/
import java.lang.String; 


class Graphm implements Graph  // Graph: Adjacency matrix

{ 

  private int [][] matrix;                // The edge matrix
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
    matrix = new int [n][n];
    numEdge = 0;
  }
  
  // function to assign each course to an index 
  public int getIndex(String coencourse)
  {
	
		int index;
		switch (coencourse)
		{
			case "MATH204":
				index = 0;
				break;

			case "COEN243":
				index = 1;
				break;

			case "COEN212":
				index = 2;
				break;

			case "COEN231":
				index = 3;
				break;

			case "COEN311":
				index = 4;
				break;

			case "COEN313":
				index = 5;
				break;

			case "COEN346":
				index = 6;
				break;

			case "COEN352":
				index = 7;
				break;

			case "ENGR290":
				index = 8;
				break;

			case "ELEC311":
				index = 9;
				break;

			case "COEN317":
				index = 10;
				break;

			case "COEN320":
				index = 11;
				break;

			case "SOEN341":
				index = 12;
				break;

			case "ELEC372":
				index = 13;
				break;

			case "COEN244":
				index = 14;
				break;

			case "COEN366":
				index = 15;
				break;

			case "ENGR301":
				index = 16;
				break;

			case "ENGR371":
				index = 17;
				break;

			case "COEN390":
				index = 18;
				break;

			case "COEN466":
				index = 19;
				break;

			case "COEN451":
				index = 20;
				break;

			case "COEN316":
				index = 21;
				break;

			case "COEN413":
				index = 22;
				break;

			case "COEN424":
				index = 23;
				break;

			case "COEN432":
				index = 24;
				break;

			case "COEN434":
				index = 25;
				break;

			case "COEN415":
				index = 26;
				break;

			case "COEN433":
				index = 27;
				break;

			case "COEN421":
				index = 28;
				break;

			case "COEN447":
				index = 29;
				break;

			case "COEN422":
				index = 30;
				break;

			case "COEN448":
				index = 31;
				break;

			case "COEN490":
				index = 32;
				break;

			case "COEN446":
				index = 33;
				break;
				
			case "COEN498":
				index = 34;
				break;
				
			case "DEPTMNT":
				index = 35;
				break;

			default:
				index = -1; 
		}
		return index;
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
  
  /**
	 * output true t;
	 * @param SourceCourse
	 * @param destinationCourse 
	 * Algorithm: 
	 * Assign the given course to the corresponding index  
	 * use isEdge to see if the number is one in the matrix, 
	 * If the number is a one, then return true 
	 * if not return false 
	 */
  
  
  public boolean isPrerequisite(String SourceCourse, String destinationCourse)
  {
	  int CourseSource = getIndex(SourceCourse); 
	  int CourseDestination = getIndex(destinationCourse);
	  
	  // check if the index is not -1 
	  if (CourseSource == -1)
	  {
		  System.out.println("invalid Course");
		  return false; 
	  }
	  
	  if (CourseDestination == -1)
	  {
		  System.out.println("invalid Course");
		  return false; 
	  }
	 return isEdge(CourseSource,CourseDestination); 
	  
  }
}
