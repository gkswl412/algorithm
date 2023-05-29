import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        long n = Long.parseLong(br.readLine());
        
        System.out.println(n*n);
        System.out.println(2);
    }
}