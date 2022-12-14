package A3;

/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/

interface Graph {                // Graph class ADT
  public void Init(int n);       // Initialize to n vertices
  public int n();                // Number of vertices
  public int e();                // Number of edges
  public int first(int v);       // Get v's first neighbor
  public int next(int v, int w); // Get v's next neighbor
  public int weight(int i, int j); // weight
  public void setEdge(int i, int j, int wght); // Set weight
  public void delEdge(int i, int j);   // Delete edge (i, j)
  public boolean isEdge(int i, int j); // If (i,j) an edge?
   public void setMark(int v, int val); // Set Mark for v
  public int getMark(int v);           // Get Mark for v
  public boolean isPrerequisite(String SourceCourse, String destinationCourse); // determines if the course is a prereq of the other
  public String getPrerequisitePath(String CourseCode); //returns the path of prerequisites for a course 
  public int getIndex(String coencourse); // getting the index
  public String [] getPrerequisites(String CourseCode);
  public String getCourse(int Index); //returns the coursecode based on index
}

