import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] croatiaAlphabets = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        String input = br.readLine();
        
        for(String alphabet:croatiaAlphabets) {
            input = input.replaceAll(alphabet,"*");
        }
        
        System.out.println(input.length());
    }
}