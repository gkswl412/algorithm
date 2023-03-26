import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        
        int n = Integer.parseInt(br.readLine());
        int result = new Main().solution(n);
        
        System.out.println(result);
    }
    
    public int solution(int n) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            result += i;
        }
        return result;
    }
}