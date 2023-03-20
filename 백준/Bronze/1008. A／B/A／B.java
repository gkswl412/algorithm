import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String input = br.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        
        double result = new Main().solution(a,b);
        
        System.out.println(result);
    }
    
    public double solution(int a, int b) {
        return (double) a / b;
    }
}