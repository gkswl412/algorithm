import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
				
		int[] dice = new int[7];
		
		
		while(st.hasMoreTokens()) {
			 dice[Integer.parseInt(st.nextToken())] += 1;
		}
		
		int result = 0;
		
		for(int i=0;i<dice.length;i++) {
			if(dice[i]==1) {
				result = i;
			}
			if(dice[i]==3) {
				result = 10000+i*1000;
				break;
			}
			if(dice[i]==2) {
				result = 1000+i*100;
				break;
			}
		}
		
		if(result < 1100) {
			result = result * 100;
		}
		
		System.out.println(result);
	}
}