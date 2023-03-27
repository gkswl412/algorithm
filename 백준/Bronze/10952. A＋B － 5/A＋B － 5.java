import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        new Main().solution(br, sb);
    }
    
    public void solution(BufferedReader br, StringBuilder sb) throws IOException{
        while(true) {
            String[] numbers = br.readLine().split(" ");
            if(numbers[0].equals("0") && numbers[1].equals("0")) {
                break;
            }
            int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}