import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        Main main = new Main();
        
        while(true) {
            String input = br.readLine();
            if(input.equals("-1")) {
                break;
            }
            
            int n = Integer.parseInt(input);
            
            String output = main.reader(n);
            
            sb.append(output).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public String reader(int n) {
        List<Integer> factors = new ArrayList<>();
        for(int i=1; i<n; i++) {
            if(n%i==0) {
                factors.add(i);
            }
        }
        
        int sum = 0;
        for(int i=0; i<factors.size(); i++) {
        	sum += factors.get(i);
        }
        
    	StringBuilder result = new StringBuilder();
        if(sum == n) {
        	result.append(n + " = ");
        	for(int i=0; i<factors.size(); i++) {
        		result.append(factors.get(i));
        		if(i != factors.size()-1) {
        			result.append(" + ");
        		}
            }
        }else {
        	return n + " is NOT perfect.";
        }
        
        return result.toString();
    }
}