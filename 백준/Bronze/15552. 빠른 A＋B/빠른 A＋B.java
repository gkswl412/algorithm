import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);
        
        int T = Integer.parseInt(br.readLine());
        
        String[] input = null;
        for(int i=0; i<T; i++) {
            input = br.readLine().split(" ");
            bw.write(Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}