import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        int result = new Main().solution(x, y);
        
        System.out.println(result);
    }
    
    public int solution(int x, int y) {
        if(x>0) {
            if(y>0) {
                return 1;
            }
            return 4;
        }
        
        if(y>0) {
            return 2;
        }
        return 3;
    }
}