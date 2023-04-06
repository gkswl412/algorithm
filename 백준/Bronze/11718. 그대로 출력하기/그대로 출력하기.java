import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String input = "";
        
        while( (input = br.readLine()) != null ) {
            sb.append(input).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}