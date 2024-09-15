public class Main{
	/*Adjacency matrix = A 2d array to store 1's and 0's to represent edges
	No of rows = no of unique nodes
	No of columns = no of unique nodes
	
	Runtime complexity to check an edge: O(1)
	Space complexity: O(v^2)
	*/
	
	public static void main(String[] args){
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		System.out.println(graph.checkEdge(0, 1));
		System.out.println(graph.checkEdge(3, 4));
		System.out.println(graph.checkEdge(2, 3));
		
	}
}
