package A3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import A3.ADTStack; 
import A3.AStack; 



/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/

// Graph operation main function.
// To use: java -ea GraphTest <graphfile>

import java.io.*;
import java.util.*;

public class GraphTest
   
{
	
	static final int UNVISITED = 0;
	static final int VISITED = 1;
	
	// Create a graph from file
	static Graph createGraph(BufferedReader file, Graph G) 
	throws IOException 
	{
			  String line = null;
			  StringTokenizer token;
			  boolean undirected = false;
			  int i, weight, v1_int, v2_int; 
			  String v1, v2; 
			
			  assert (line = file.readLine()) != null :
			         "Unable to read number of vertices";
			  while(line.charAt(0) == '#')
			  assert (line = file.readLine()) != null :
			         "Unable to read number of vertices";
			  token = new StringTokenizer(line);
			  
			  int n = Integer.parseInt(token.nextToken());
			  G.Init(n);
			  
			  for (i=0; i<n; i++)
			    G.setMark(i, UNVISITED);
			  
			  assert (line = file.readLine()) != null :
			         "Unable to read graph type";
			  
			  if (line.charAt(0) == 'U')
			    undirected = true;
			  else if (line.charAt(0) == 'D')
			    undirected = false;
			  else assert false : "Bad graph type: " + line;
			
			  // Read in edges
			  while((line = file.readLine()) != null) {
				token = new StringTokenizer(line);
			    v1 = token.nextToken();
			    v2 = token.nextToken();
			    if (token.hasMoreTokens())
			      weight = Integer.parseInt(token.nextToken());
			    else // No weight given -- set at 1
			      weight = 1;
			    v1_int = G.getIndex(v1); 
			    v2_int = G.getIndex(v2); 
			    G.setEdge(v1_int, v2_int, weight);
			    if (undirected) // Put in edge in other direction
			      G.setEdge(v2_int, v1_int, weight);
			  }
			  return G;
	}
	
	
	static void Gprint(Graph G, StringBuffer out) {
		  int i, j;
		
		  for (i=0; i<G.n(); i++) {
		    for(j=0; j<G.n(); j++)
		      if (G.weight(i, j) == Integer.MAX_VALUE)
		        out.append("0 ");
		      else
		        out.append(G.weight(i, j) + " ");
		  }
	}
	
	
	/**
	 * output connected component;
	 * @param G
	 */
	static void concom(Graph G) {
		  int i;
		  for (i=0; i<G.n(); i++)  // For n vertices in graph
		    G.setMark(i, 0);       // Vertex i in no component
		  
		  int comp = 1;            // Current component
		  
		  for (i=0; i<G.n(); i++)
		    if (G.getMark(i) == 0) // Start a new component
		      DFS_component(G, i, comp++);
		  
		  for (i=0; i<G.n(); i++)
		    out.append(i + "[" + G.getMark(i) + "] ");
	}
	
	
	static void DFS_component(Graph G, int v, int comp) {
	  
	  G.setMark(v, comp);
	  
	  for (int w = G.first(v); w < G.n(); w = G.next(v, w))
	    if (G.getMark(w) == 0)
	      DFS_component(G, w, comp);
	}
	
	
	static void DFS(Graph G, int v) { // Depth first search
		  PreVisit(G, v);                 // Take appropriate action
		  G.setMark(v, VISITED);
		  for (int w = G.first(v); w < G.n() ; w = G.next(v, w))
		    if (G.getMark(w) == UNVISITED)
		      DFS(G, w);
		  PostVisit(G, v);                // Take appropriate action
		
 }
	
	/**
	 * depth first traversal
	 */
	   static void PreVisit(Graph G, int v) {
		  out.append(v + "pre "); //subject to the application
		}

		static void PostVisit(Graph G, int v) {
		  out.append(v + "pos "); // subject to the application 
		}
		
		 public boolean isCyclic(Graph G, int start) {
			
			 ADTStack<Integer> stack = new AStack<Integer>(G.n());
				stack.push(start);
				while(stack.length()>0) {	
					int v = stack.topValue();
					stack.pop();
					G.setMark(v, VISITED);
					if(((Graphm) G).incrCount(v)>1)
						return true;
					int temp = v; 
					for (int w = G.first(temp); w < G.n(); w = G.next(temp,w)) {
					    if (G.getMark(w) == UNVISITED) { // Put next to stack   	
					    	stack.push(w);
					    	G.setMark(w, VISITED);  	
					    	int k = G.first(w); 
					    	while(k<G.n()) {
					    		 if (G.getMark(k) == UNVISITED) {
					    			 G.setMark(k, VISITED);
					    			 stack.push(k);
					    			 temp = k;
					    			 break;
					    		 }
					    		 k = G.next(w, k);
					    	}
					    }
					    if(((Graphm) G).incrCount(w)>1)
							return true;
					 }
				}
			 return false;
		 }
		
	
	  /**
	   * This method is automatically called once before each test case
	   * method, so that all the variables are cleanly initialized for
	   * each test.
	   */
	static StringBuffer out;
	
	 @BeforeEach
	  public void setUp()
	  {
	    out = new StringBuffer(100);
	  }
	
	  
	@Test
	 public void testisPrerequisite() throws IOException{
			BufferedReader f;
			f = new BufferedReader(new InputStreamReader(new FileInputStream("coen_course.gph")));
			Graph G = new Graphm();
			createGraph(f, G);
		
			assertEquals(true,G.isPrerequisite("COEN212","COEN313"), "Test failed, The course is a prerequisite even if it should not be");
			assertEquals(true,G.isPrerequisite("COEN311","COEN316"), "Test failed, The course is a prerequisite even if it should not be");
			assertEquals(false,G.isPrerequisite("COEN317","COEN490"), "Test failed, The course is a prerequisite even if it should not be");
			assertEquals(false,G.isPrerequisite("COEN231","COEN346"), "Test failed, The course is a prerequisite even if it should not be");
			
	}
	 @Test
	  public void testGetPrerequisitePath() throws IOException{
		  
		  	BufferedReader f;
			f = new BufferedReader(new InputStreamReader(new FileInputStream("coen_course.gph")));
			Graph G = new Graphm();
			createGraph(f, G);
			
			assertEquals("MATH204 COEN231 COEN212 COEN313 ",G.getPrerequisitePath("COEN313"),"TEST FAILED");
			assertEquals("MATH204 COEN212 COEN243 COEN244 COEN231 COEN352 COEN311 COEN346 ",G.getPrerequisitePath("COEN346"),"TEST FAILED");
			assertEquals("MATH204 COEN212 COEN243 COEN244 COEN231 ENGR290 COEN352 COEN311 COEN390 ENGR371 ENGR301 SOEN341 COEN490 ",G.getPrerequisitePath("COEN490"),"TEST Failed");
	  }
	  

}