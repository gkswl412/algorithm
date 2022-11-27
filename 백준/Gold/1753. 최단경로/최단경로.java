
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static int k; // 시작정점
	public static int v; // 정점수
	public static ArrayList<Node>[] edge; // 간선정보
	public static int[] result; // 출력값
	public static boolean[] visited; // 방문여부판단
	public final static int inf = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		
		edge = new ArrayList[v+1];
		for(int i=0; i<=v; i++) {
			edge[i] = new ArrayList<Node>();
		}
		
		result = new int[v+1];
		visited = new boolean[v+1];
		
		for(int i=1; i<=v; i++) {
			result[i] = inf;
		}
		
		int from = 0;
		int to = 0;
		int weight = 0;
		for(int i=0;i<e;i++) {
			st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
			Node node = new Node(to,weight);
			edge[from].add(node);
		}
		
		// 다익스트라 알고리즘 실행
		dx();
		
		//출력
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=v; i++) {
			sb.append(result[i]==inf?"INF":result[i]).append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static void dx() {
		// 시작정점이 현재정점이 된다.
		int cur = k;
		
		// 시작정점의 가중치는 0이 된다.
		result[cur] = 0;
		
		// 현재 정점의 가중치를 정의한다.
		int curWeight = 0;
		
		// 방문가능한 정점을 담은 최소힙
		PriorityQueue<Node> h = new PriorityQueue<>();
		h.add(new Node(cur,0));
		while(true) {
			// 최소힙 변화 출력
			/*System.out.print("현재 정점: " + cur);
			for(Node n:h) {
				System.out.print(" (idx: " + n.idx + ", weight: " + n.weight + ") ");
			}*/
			
			try {
				cur = h.poll().idx;
				//h.removeAll(h);
			}catch(NullPointerException e) {
				break;
			}
			
			if(visited[cur]) continue;
			
			// 현재 정점 방문처리
			visited[cur] = true;
			
			// 시작정점에서 현재 위치한 정점까지의 가중치
			curWeight = result[cur];
			
			// 현재 위치한 정점과 연결된 간선 정보 읽기
			for(Node nod:edge[cur]) {
				curWeight += nod.weight;
				if(result[nod.idx] > curWeight) {
					result[nod.idx] = curWeight;
					h.add(new Node(nod.idx,result[nod.idx]));
				}
				curWeight = result[cur];
			}
			
			// 결과 변화 출력
			/*System.out.print("result: ");
			for(int i=1;i<=v;i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();*/
			
		}
	}
	
	public static class Node implements Comparable<Node>{
		int idx;
		int weight;
		
		public Node(){}
		public Node(int idx, int weight) {
			this.idx = idx;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
		
	}

}
