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
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> numberCard = new HashMap<String, Integer>();
		
		String[] numbers = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			if(numberCard.containsKey(numbers[i])) {
				int value = numberCard.get(numbers[i]) + 1;
				numberCard.put(numbers[i], value);
			} else {
				numberCard.put(numbers[i], 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		String[] targetNumbers = br.readLine().split(" ");
		for(String number: targetNumbers) {
			if(numberCard.containsKey(number)) {
				sb.append(numberCard.get(number)).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}