import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Map<String, String> peopleInCompany = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			String name = input[0];
			String action = input[1];
			peopleInCompany.put(name, action);
		}
		
		List<String> result = new ArrayList<>();
	    		
		for(String name : peopleInCompany.keySet()) {
			if(peopleInCompany.get(name).equals("enter")) {
				result.add(name);
			}
		}
		
		Collections.sort(result, (a,b) -> b.compareTo(a));
		
		for(int i=0; i<result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}