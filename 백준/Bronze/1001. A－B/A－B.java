import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        
        String str = br.readLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        
        int result = solution(a,b);
        System.out.println(result);
    }
    
    public static int solution(int a, int b) {
        return a-b;
    }
}