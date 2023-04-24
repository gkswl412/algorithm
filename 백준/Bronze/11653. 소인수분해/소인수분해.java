import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        Main main = new Main();
        
        int n = Integer.parseInt(br.readLine());
        
        if(n==1){
        	return;
        }
        
        while(!main.finder(n)) {
        	for(int i=2; i<n; i++) {
        		if(main.finder(i) && n%i==0) {
        			sb.append(i).append("\n");
        			n /= i;
        			break;
        		}
        	}
        }
        
        sb.append(n).append("\n");
        
        System.out.println(sb);
	
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