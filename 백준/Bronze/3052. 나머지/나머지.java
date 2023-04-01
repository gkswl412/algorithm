import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        boolean[] checker = new boolean[42];
        
        for(int i=0; i<10; i++) {
            checker[Integer.parseInt(br.readLine()) % 42] = true; 
        }
        
        int result = 0;
        
        for(int i=0; i<checker.length; i++) {
            if(checker[i]) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}