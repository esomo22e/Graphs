import java.util.ArrayList;


public class GraphVertexIMP<T> implements GraphVertex<T>{
		/**Instance fields**/
		private T data;
		private boolean visited;
		//private GraphVertex<T> vert;

		private ArrayList<GraphVertex<T>> vertices = new ArrayList<GraphVertex<T>>();
	
	@Override
	//set the data 
	public void setData(T data) {
		// TODO Auto-generated method st
		this.data = data;
	}

	@Override
	//method to get the data
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}
	//add neighbor tot he array list
	public void addNeighbors(GraphVertex<T> vert) {
		// TODO Auto-generated method stub
		vertices.add(vert);
	}

	@Override
	//get these neighbors
	public ArrayList<GraphVertex<T>> getNeighbors() {
		// TODO Auto-generated method stub
		return vertices;
	}


	@Override
	//see is the vertices are visited
	public boolean isVisited() {
		// TODO Auto-generated method stub
		return 	visited;
	}
	@Override
	//set the visited vertices
	public void setVisited( boolean visited) {
		// TODO Auto-generated method stub
		this.visited = visited;
	}
	@Override
	//create a toString method to change your data into a string
	public String toString(){
		return data + "";
	}
}
