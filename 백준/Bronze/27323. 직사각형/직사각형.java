import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        System.out.println(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
    }
}