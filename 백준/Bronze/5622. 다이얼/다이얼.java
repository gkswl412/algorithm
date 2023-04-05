import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String input = br.readLine();
        int result = 0;
        
        for(int i=0; i<input.length(); i++) {
            int asciiNumber = (int) input.charAt(i);
            int dialNumber = 1;
            
            if(asciiNumber > 64) {
                dialNumber++;
            }
            
            if(asciiNumber > 67) {
                dialNumber++;
            }
            
            if(asciiNumber > 70) {
                dialNumber++;
            }
            
            if(asciiNumber > 73) {
                dialNumber++;
            }
            
            if(asciiNumber > 76) {
                dialNumber++;
            }
            
            if(asciiNumber > 79) {
                dialNumber++;
            }
            
            if(asciiNumber > 83) {
                dialNumber++;
            }
            
            if(asciiNumber > 86) {
                dialNumber++;
            }
            
            dialNumber++;
            
            result += dialNumber;
        }
        
        System.out.println(result);
    }
}