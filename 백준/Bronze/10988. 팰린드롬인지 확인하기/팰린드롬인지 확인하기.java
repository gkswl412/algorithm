import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String input = br.readLine();
        int result = 1;
        for(int i=0; i<input.length()/2; i++) {
            if(input.charAt(i) == input.charAt(input.length()-1-i)) {
                continue;
            }else {
                result = 0;
            }
        }
        
        System.out.println(result);
    }
}