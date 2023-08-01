package datastructures;

import java.io.*;
import java.util.*;



public class BFS {

	private int node;
	private LinkedList<Integer> adj[];
	private Queue<Integer> que;
	
	BFS(int v)
	{
		node = v;
		adj = new LinkedList[node]; //array declaration
		for(int i=0; i<v; i++)
		{
			adj[i] = new LinkedList<>(); //adding linked list to ith index of an array
		}
		que = new LinkedList<>();
	}
	
	void insertEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	void BFSearch(int n) {
		boolean visited[] = new boolean[node];
		int a = 0;
		visited[n] = true;
		que.add(n);
		while(!que.isEmpty()) {
			n = que.poll();
			System.out.println(n+" ");
			for(int i=0; i<adj[n].size(); i++)
			{
				a = adj[n].get(i);
				if(visited[a] == false) {
					visited[a] = true;
					que.add(a);
				}
				
			}
		}
		
	}
	

	public static void main(String args[])
	{
		BFS graph = new BFS(6);
		graph.insertEdge(0, 1);
		graph.insertEdge(0, 3);
		graph.insertEdge(0, 4);
		graph.insertEdge(4, 5);
		graph.insertEdge(3, 5);
		graph.insertEdge(1, 2);
		graph.insertEdge(1, 0);
		graph.insertEdge(2, 1);
		graph.insertEdge(4, 1);
		graph.insertEdge(3, 1);
		graph.insertEdge(5, 4);
		graph.insertEdge(5, 3);
		System.out.println("The BFS Traversal");
		graph.BFSearch(0);	
	}
}
