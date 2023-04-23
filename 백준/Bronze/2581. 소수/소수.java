import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        Main main = new Main();
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        List<Integer> primeNumbers = new ArrayList<>();
        
		for(int i=N; i<=M; i++) {
			if(main.finder(i)) {
				primeNumbers.add(i);
			}
    	}
		
		if(primeNumbers.isEmpty()) {
			System.out.println(-1);
		}else {
			int sum = 0;
			for(int element:primeNumbers) {
				sum += element;
			}
			System.out.println(sum);
			System.out.println(primeNumbers.get(0));
		}
    }
    
    public boolean finder(int num) {
    	if(num == 1) {
    		return false;
    	}
    	
    	for(int i=2; i<num; i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}