import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class GraphIMP<T> implements Graph<T>{

	//create a hashSet	
	private Set<GraphVertex<T>> vertSet = new HashSet<GraphVertex<T>>();
	
	@Override
	public void addHashSet(GraphVertex<T> hashVert) {
		// TODO Auto-generated method stub
		//add a vertex to the hashSet
		vertSet.add(hashVert);
	}
	
	@Override
	/** The helper method allows you to create a new Array list to see if the vertex was visited or not**/
	public List<GraphVertex<T>> dfs( GraphVertex v) {
		// TODO Auto-generated method stub
		List<GraphVertex<T>> dfsVert = new ArrayList<GraphVertex<T>>();
	
		
				//if the vertex is visited
				v.setVisited(true);
				//then do a depth first search
				dfsVisit(v, dfsVert);
				
			//}
		//}
		
		return dfsVert;
		
	}
	/**The method that does all the workd**/
	public void dfsVisit( GraphVertex<T> v, List<GraphVertex<T>> list){
		//add the vertex to the list
		list.add(v);
		//create a for loop to check all the neighbors
		for(int i = 0; i< v.getNeighbors().size(); i++){
			//if the neighbors doen't get visited
			if(v.getNeighbors().get(i).isVisited() == false){
				//visit the vertex neighbors
				v.getNeighbors().get(i).setVisited(true);
				//do a depth first search visit through the list
				dfsVisit(v.getNeighbors().get(i),list);
			}
		}
	}
	/**To string methodned for deth first search**/
	public String toDFSString(GraphVertex v){
		//String dfsList = "";
		//create a list
		List<GraphVertex<T>> list = dfs(v);
		
	
		//dfsList+= list.toString();
		//add a two string method to the list
		return list.toString();
	}
	@Override
	public List<GraphVertex<T>> bfs(GraphVertex v) {
		// TODO Auto-generated method stub
		//create an array list
		List<GraphVertex<T>> bfsVert = new ArrayList<GraphVertex<T>>();
		//create a queue
		Queue<GraphVertex<T>> qVert = new QueueLL<GraphVertex<T>>();
		
		//for (GraphVertex<T> vertex : vertSet) {
			//
			//the queue will enque the vertex
			qVert.enqueue(v);
			//while the queue is not empty
			while (!qVert.isEmpty()) {
				//dequeue the queeu
				v = qVert.dequeue();
				//add a vertex to the list
				bfsVert.add(v);
				//for loop to chech the neighbors
				for (int i = 0; i < v.getNeighbors().size(); i++) {
					//if the vertex is not visited
					if (((GraphVertex) v.getNeighbors().get(i)).isVisited() == false) {
						//make a temporary vertex
						GraphVertex temp = (GraphVertex) v.getNeighbors().get(i);
						//visit the vertex
						temp.setVisited(true);
						//enqueue the vertex
						qVert.enqueue(temp);
					}
				}
			}
		//}
		return bfsVert;
	}
	/** Breadth First Search String Method**/
	public String toBFSString(GraphVertex v){
		//String bfsList = "";
		//create a list which does the breadth first search
		List<GraphVertex<T>> list = bfs(v);
		
*/		
		//make a string to the list
		return list.toString();
	}

}
