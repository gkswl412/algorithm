import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        String[] input = null;
        
        for(int i=0; i<T; i++) {
            input = br.readLine().split(" ");
            sb.append(Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "\n");
        }
        
        System.out.println(sb);
    }
}