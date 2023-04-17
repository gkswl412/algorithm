import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        
        Main main = new Main();
        
        while(num != 0) {
            sb.append(main.parser(num%N));
            num /= N;
        }
        
        String reversedResult = sb.toString();
        String result = "";
        
        for(int i=reversedResult.length()-1;i>=0;i--) {
            result += reversedResult.charAt(i);
        }
        
        System.out.println(result);
    }
    
    public String parser(int num) {
        if(num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf((char)(num+55));
        }
    }
}