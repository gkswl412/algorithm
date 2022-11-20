
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	boolean[] v;
	int idx=0;
	int[] answer;
	ArrayList<Integer>[] nodeInfo; 
	
	public void dfs(int cur) {
		v[cur] = true;
		answer[cur] = ++idx;
		for(int next:nodeInfo[cur]) {
			if(v[next]) continue;
			dfs(next);
		}
	}
	
	private void solution() throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		//System.out.println("정점수:" + n + " 간선수:" + m + " 시작정점:" + r);
		
		// 초기화
		nodeInfo = new ArrayList[n+1];
		for(int i=0;i<=n;i++) nodeInfo[i] = new ArrayList<>();
		answer = new int[n+1];
		v = new boolean[n+1];
		
		// 간선정보 담기
		while( m-- > 0 ) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			nodeInfo[u].add(v);
			nodeInfo[v].add(u);
		}
		
		for(int i=1; i<=n; i++) {
			Collections.sort(nodeInfo[i]);
			Collections.reverse(nodeInfo[i]);
		}
		v[r] = true;
		dfs(r);
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) sb.append(answer[i]).append("\n");
		System.out.println(sb);
	}
	

	public static void main(String[] args) throws IOException {
		new Main().solution();
	}

}
