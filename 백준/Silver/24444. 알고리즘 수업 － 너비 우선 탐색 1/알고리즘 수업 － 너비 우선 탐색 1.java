
import java.io.*;
import java.util.*;

public class Main {
	public static Queue<Integer> q;
	public static boolean[] visited;
	public static int idx=0;
	public static int[] answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = 
			new StringTokenizer(br.readLine());
		StringBuilder sb = 
			new StringBuilder();
			
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		answer = new int[n+1];
		ArrayList<Integer>[] edge = new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			edge[i] = new ArrayList();
		}
		int u = 0;
		int v = 0;
		while(m-->0){
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			edge[u].add(v);
			edge[v].add(u);
		}
		
		for(int i=1; i<=n; i++) {
			Collections.sort(edge[i]);
		}
		
		/*
		 * for(int i=0; i<=n; i++) { System.out.print(i + ": "); for(int j : edge[i]) {
		 * System.out.print(j + " "); } System.out.println(); }
		 */
		
		q = new LinkedList<>();
		q.add(r);
		visited[r] = true;
		
		while(!q.isEmpty()) {
			/* System.out.println(q.toString()); */
			r = q.poll();
			visited[r] = true;
			answer[r] = ++idx;
			for(int vertex : edge[r]) {
				if(!visited[vertex]) {
					q.add(vertex);
					visited[vertex] = true;
				}
			}
		}
		
		for(int i=1; i<=n; i++) sb.append(answer[i]).append("\n");
		System.out.println(sb);
	}
	
}