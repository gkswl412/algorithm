import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int xMin = 10000;
        int xMax = -10000;
        int yMin = 10000;
        int yMax = -10000;
        
        if(n==1) {
        	System.out.println(0);
        	return;
        }
        
        while(n-->0) {
        	String[] numbers = br.readLine().split(" ");
        	
        	if(Integer.parseInt(numbers[0]) > xMax) {
        		xMax = Integer.parseInt(numbers[0]);
        	}
        	
        	if(Integer.parseInt(numbers[0]) < xMin) {
        		xMin = Integer.parseInt(numbers[0]);
        	}
        	
        	if(Integer.parseInt(numbers[1]) > yMax) {
        		yMax = Integer.parseInt(numbers[1]);
        	}
        	
        	if(Integer.parseInt(numbers[1]) < yMin) {
        		yMin = Integer.parseInt(numbers[1]);
        	}
        }
        int result = Math.abs(xMax-xMin) * Math.abs(yMax-yMin);
        System.out.println(result);
    }    
}