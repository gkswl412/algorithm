import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for(String pNum : input) {
            int num = Integer.parseInt(pNum);
            if(num < k) {
                sb.append(num + " ");
            }
        }
        System.out.println(sb);
    }
}