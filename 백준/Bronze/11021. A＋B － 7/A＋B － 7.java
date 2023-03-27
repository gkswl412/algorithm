import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        String[] input = null;
        for(int i=1; i<=n; i++) {
            input = br.readLine().split(" ");
            sb.append("Case #" + i + ": " + (Integer.parseInt(input[0]) + Integer.parseInt(input[1])) + "\n");
        }
        
        System.out.println(sb);
    }
}