import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        String targetNumber = br.readLine();
        int result = 0;
        
        for(int i=0; i<n; i++) {
            if(numbers[i].equals(targetNumber)) {
                result ++;
            }
        }
        
        System.out.println(result);
    }
}