import java.util.ArrayList;


public interface GraphVertex<T> {

	public void setData(T data);
	
	public T getData();
	
	public void addNeighbors(GraphVertex<T> vert);
	
	public ArrayList<GraphVertex<T>> getNeighbors();
	
	
	
	
	public boolean isVisited();
	
	public void setVisited(boolean visited);
}
