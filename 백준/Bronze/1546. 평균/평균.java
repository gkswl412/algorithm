import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] scores = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        double max = max(scores);
        
        double sum = 0;
        for(int score:scores) {
            sum += (score/max)*100;
        }
        
        double result = sum / N;
        
        System.out.println(result);
    }
    
    public static double max(int[] scores) {
    	double max = 0;
        
        for(int score:scores) {
            if(score > max) {
                max = score;
            }
        }
        
        return max;
    }
}