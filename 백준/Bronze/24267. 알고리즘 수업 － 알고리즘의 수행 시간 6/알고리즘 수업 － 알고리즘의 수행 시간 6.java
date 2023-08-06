import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        long n = Integer.parseInt(br.readLine());
        
        long result = ( (n-2)*(n-2)*(n-2) + 3*(n-2)*(n-2) + 2*(n-2) ) / 6;
        
        //if (n>=3) {
            System.out.println(result);
            System.out.println(3);
        //} else {
            //System.out.println(4);
        //}  
    }
}