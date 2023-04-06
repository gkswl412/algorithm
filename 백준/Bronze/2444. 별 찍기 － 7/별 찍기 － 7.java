import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<n; i++) {
            for(int j=i; j<n; j++) {
                sb.append(" ");
            }
            for(int k=0; k<(i*2-1); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        for(int i=n; i>0; i--) {
            for(int j=i; j<n; j++) {
                sb.append(" ");
            }
            for(int k=0; k<(i*2-1); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}