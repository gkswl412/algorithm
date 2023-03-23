
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int year = Integer.parseInt(br.readLine());
        
        int result = new Main().solution(year);
        
        System.out.println(result);
    }
    
    public int solution(int year) {
        int result = 0;
        
        if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            result = 1;
        }
        
        return result;
    }
}