package dataStructures;
import java.util.*;
import java.io.*;

public class Graph {
	
	private ArrayList<Integer>adj[];
	
	public Graph(int V)
	{
		adj=new ArrayList[V];
		for(int i=0;i<V;i++)
		{
			adj[i]=new ArrayList<>();
		}
		System.out.println("Graph Created");
	}

}
