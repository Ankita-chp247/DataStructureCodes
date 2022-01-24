public class Graph {
	class Edge{
		int src,dest;
	}
	
	int vertices, edges;
	Edge[] edge ;                       //Array store all edges
	
	Graph(int vertices,int edges){
		this.vertices=vertices;
		this.edges = edges;
		edge = new Edge[edges];
		for(int i =0; i< edges;i++) {
			edge[i] = new Edge();
					
		}
	}
	public static void main(String args[]) {
		int noVertices = 4 ;
		int noEdges = 6 ;
		
   Graph g= new Graph( noVertices,  noEdges) ;
   
   //create graph
   
   g.edge[0].src = 1;  // edges 1__2
   g.edge[0].dest = 2;
   
   g.edge[1].src = 2;   //edges 2__3
   g.edge[1].dest = 3;
   
   g.edge[2].src = 3;  // edges3__4
   g.edge[2].dest = 4;
   
   g.edge[3].src = 4;    // edges 4__5
   g.edge[3].dest = 5;
   
   g.edge[4].src = 5;     //edges 5__6
   g.edge[4].dest = 6;
	   
 
		for (int i= 0;i<noEdges;i++) {
			System.out.println(g.edge[i].src+"_"+ g.edge[i].dest);
		}
	}
}
