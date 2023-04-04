import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int result = 0;

        String input = br.readLine().trim();
        
        String[] words = input.split(" ");

        
        if(input.equals("")) {
        	result = 0;
        }else {
        	result = words.length;
        }
        
        
        System.out.println(result);

    }
}