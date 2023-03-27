import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int n = Integer.parseInt(br.readLine());
        
        new Main().solution(n);
    }
    
    public void solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            sb.append("*".repeat(i) + "\n");
        }
        System.out.println(sb);
    }
}