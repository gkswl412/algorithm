import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        String[] input = null;
        int sum = 0;
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            sum += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        }
        
        if(total == sum) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}