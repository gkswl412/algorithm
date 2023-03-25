import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int N = Integer.parseInt(br.readLine());
        
        new Main().solution(N);
    }
    
    public void solution(int N) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<10; i++) {
            sb.append(N + " * " + i + " = " + N*i + "\n");
        }
        System.out.println(sb);
    }
}