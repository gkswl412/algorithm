import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int from = 1;
		int by = 2;
		int to = 3;
		
		hanoi(N,from,by,to);
		
		System.out.println(sb.length()/4);
		System.out.println(sb);

	}
	
	public static void hanoi(int N, int from, int by, int to) {
		if(N==1) {
			sb.append(from+" "+to+"\n");
			return;
		}else {
			hanoi(N-1,from,to,by);
			sb.append(from+" "+to+"\n");
			hanoi(N-1,by,from,to);
		}
	}
}