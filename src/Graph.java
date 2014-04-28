import java.util.List;

public interface Graph<T> {
	
	public void addHashSet(GraphVertex<T> hashVert);
	
	public List<GraphVertex<T>> dfs(GraphVertex v);
	public List<GraphVertex<T>> bfs( GraphVertex v);

	
}
