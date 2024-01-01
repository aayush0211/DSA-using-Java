package tester;

import java.util.Scanner;

import graphOperation.GraphBfsDFSByMatrix;

public class GraphDfsBfsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertices in graph: ");
		GraphBfsDFSByMatrix graph = new GraphBfsDFSByMatrix(sc.nextInt());
        graph.accept(sc);
        graph.display();
        System.out.println("enter starting vertics");
        System.out.println("BFS display graph");
        graph.bfsPrint(sc.nextInt());
	}

}
