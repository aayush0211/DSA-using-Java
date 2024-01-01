package graphOperation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class GraphBfsDFSByMatrix {

         private int verticsCount;
         private int[][] adjMatrix;
         
         public GraphBfsDFSByMatrix(int verticsCOunt) {
        	 this.verticsCount=verticsCOunt;
        	 adjMatrix = new int[verticsCOunt][verticsCOunt];
         }
         
         public void accept(Scanner sc) {
        	 System.out.println("enter number of edges in graph");
        	 int edges = sc.nextInt();
        	 for(int i=0;i<edges;i++) {
        		 System.out.println("enter src and destination");
        		 int src=sc.nextInt();
        		 int dest=sc.nextInt();
        		 adjMatrix[src][dest]=1;
        		 adjMatrix[dest][src]=1;
        	 }
         }
         
         public void display() {
        	 for(int i=0;i<verticsCount;i++) {
        		 for(int j=0;j<verticsCount;j++)
        		 System.out.print(adjMatrix[i][j]+" ");
        		 System.out.println();
        	 }
         }
         
         public void bfsPrint(int startvertics) {
        	 Queue<Integer>queue = new LinkedList<Integer>();
        	 Set<Integer>visited = new HashSet<Integer>();
        	 queue.offer(startvertics);
        	 visited.add(startvertics);
        	 
        	 while(!queue.isEmpty()) {
        	int trav = queue.poll();
        	System.out.print(trav+" ");
        	 for(int i=0;i<verticsCount;i++) {
        	 if(adjMatrix[trav][i]!=0) {
        		 if(!visited.contains(adjMatrix[trav][i])) {
        			 queue.offer(adjMatrix[trav][i]);
        			 visited.add(adjMatrix[trav][i]);
        		 }
        			
        		 }
        	 }
        	 }
         }
         }
   

