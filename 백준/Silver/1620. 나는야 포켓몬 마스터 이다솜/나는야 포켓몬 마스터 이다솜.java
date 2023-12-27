import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		StringBuilder sb = new StringBuilder();
		
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		Map<String, String> pokemons = new HashMap<>();
		Map<String, String> pokemons2 = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			String input = br.readLine();
			pokemons.put(i+"", input);
			pokemons2.put(input, i+"");
		}
		
		for(int i=0; i<m; i++) {
			String input = br.readLine();
			if(pokemons.containsKey(input)) {
				sb.append(pokemons.get(input)).append("\n");
			}else {
				sb.append(pokemons2.get(input)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}