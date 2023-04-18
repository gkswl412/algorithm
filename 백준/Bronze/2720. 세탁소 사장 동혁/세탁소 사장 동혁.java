import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        Main main = new Main();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(main.cal(C)).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public String cal(int c) {
        // 25, 10, 5 ---> 전부 5의 배수 , 
        int c25 = c/25;
        c = c % 25;
        int c10 = c/10;
        c = c % 10;
        int c5 = c/5;
        int c1 = c%5;
        return String.format("%d %d %d %d",c25,c10,c5,c1);
    }
}