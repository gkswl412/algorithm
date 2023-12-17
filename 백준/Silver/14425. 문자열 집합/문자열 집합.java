import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		String[] S = new String[n];
		
		for(int i=0; i<n; i++) {
			S[i] = br.readLine();
		}
		
		int count = 0;
		for(int i=0; i<m; i++) {
			String input = br.readLine();
			for(int j=0; j<S.length; j++) {
				if(input.equals(S[j])) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}