import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            String str = input[1];
            
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                String parsedString = String.valueOf(c);
                sb.append(parsedString.repeat(n));
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}