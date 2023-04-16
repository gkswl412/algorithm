import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[1]);
        int result = 0;
        
        Main main = new Main();
        
        String num = input[0];
        int len = num.length()-1;
    	for(int i=0; i<=len; i++) {
            result += main.parser(num.charAt(i)) * Math.pow(N, (len-i));
        }
        
        System.out.println(result);
    }
    
    public int parser(int input) {
    	// 48 ~ 57 ---> 0 ~ 9
    	// 65 ~ 90 ---> A ~ Z
    	if(input < 58) {
    		return (input - 48);
    	}
    	
    	return input - 55;
    }
}