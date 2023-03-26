import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        
        String result = new Main().solution(n);
        
        System.out.println(result);
    }
    
    public String solution(int n) {
        String result = "";
        for(int i=n; i>=4; i=i-4) {
            result += "long ";
        }
        result += "int";
        return result;
    }
}