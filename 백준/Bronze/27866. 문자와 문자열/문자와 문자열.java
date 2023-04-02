import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(input.charAt(n-1));
    }
}