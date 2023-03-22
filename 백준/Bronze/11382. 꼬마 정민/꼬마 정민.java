import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] numbers = br.readLine().split(" ");
        
        System.out.println(new Main().solution(numbers));
    }
    
    public long solution(String[] numbers) {
        long result = 0;
        
        for(int i=0; i<numbers.length; i++) {
            result += Long.parseLong(numbers[i]);
        }
        
        return result;
    }
}