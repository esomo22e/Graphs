import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class GraphIMPTest {
	
	/*Make a public graph*/
	public GraphIMP<String> graph = new GraphIMP<String>();
	//need to create the graph vertex outside the testInit so we can declare it in the test
	GraphVertexIMP<String> a = new GraphVertexIMP<String>();
	@Before
	/** For each vertex you need to set the data, add to hashSet, and if they have neighbors, add neighbors to create a graph**/
	public void testInit()
	{
		
		//set the data for the vertex
		a.setData("A");
		//add to hashSet
		graph.addHashSet(a);
		//create a new vertex
		GraphVertexIMP<String> b = new GraphVertexIMP<String>();
		//set the data 
		b.setData("B");
		graph.addHashSet(b);
		//add to hashSet
		a.addNeighbors(b);
		
		GraphVertexIMP<String> c = new GraphVertexIMP<String>();
		c.setData("C");
		graph.addHashSet(c);
		a.addNeighbors(c);
		b.addNeighbors(c);
		
		GraphVertexIMP<String> d = new GraphVertexIMP<String>();
		d.setData("D");
		graph.addHashSet(d);
		a.addNeighbors(d);
		
		
		GraphVertexIMP<String> e = new GraphVertexIMP<String>();
		e.setData("E");
		graph.addHashSet(e);
		b.addNeighbors(e);
		d.addNeighbors(e);
		
		GraphVertexIMP<String> f = new GraphVertexIMP<String>();
		f.setData("F");
		graph.addHashSet(f);
		d.addNeighbors(f);
	}
	@Test
	public void testDFS() {
		//test the depth first search method
				assertEquals("[A, B, C, E, D, F]", graph.toDFSString(a));

	}
	
	@Test
	public void testBFS(){
		//test the breadth first search method
		assertEquals("[A, B, C, D, E, F]", graph.toBFSString(a));
	}

}
