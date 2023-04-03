import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            sb.append("" + input.charAt(0) + input.charAt(input.length()-1) + "\n");
        }
        
        System.out.println(sb);
    }
}