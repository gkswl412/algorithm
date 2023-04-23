import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        Main main = new Main();
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int result = 0;
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(input[i]);
            if(main.finder(num)) {
                result += 1;
            }
        }
        
        System.out.println(result);
    }
    
    public boolean finder(int num) {
        if(num == 1) {
            return false;
        }
        
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}