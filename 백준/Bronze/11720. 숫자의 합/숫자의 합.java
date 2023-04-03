import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        
        int result = 0;
        while(n > 0) {
            result += (int) input.charAt(input.length()-n) - 48;
            n -= 1;
        }
        
        System.out.println(result);
    }
}