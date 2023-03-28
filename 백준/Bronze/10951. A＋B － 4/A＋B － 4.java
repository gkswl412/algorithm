import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] numbers = null;
        
        while(true) {
            String input = br.readLine();
            if(input == null) {
                break;
            }
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            sb.append((a+b)+"\n");
        }
        
        System.out.println(sb);
    }
}