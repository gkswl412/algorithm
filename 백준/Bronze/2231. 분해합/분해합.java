import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        
        int parent = 0;
        for (int i=0; i<n; i++) {
            int child = 0;
            child += i;
            String strNum = String.valueOf(i);
            String[] numbers = strNum.split("");
            for (int j=0; j<numbers.length; j++) {
                child += Integer.parseInt(numbers[j]);
            }
            
            if (child == n) {
                parent = i;
                break;
            }
        }
        
        System.out.println(parent);
    }
}