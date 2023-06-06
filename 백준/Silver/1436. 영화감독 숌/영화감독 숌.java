import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        
        int titleNumber = 0;
        String title = "";
        
        while (n!=0) {
            title = String.valueOf(titleNumber);
            if ( title.contains("666") ) {
                n--;
            }
            titleNumber++;
        }
        
        System.out.println(title);
    }
}