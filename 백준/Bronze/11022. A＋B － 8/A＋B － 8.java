import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        String[] numbers = null;
        
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        for(int i=1; i<=T; i++) {
            numbers = br.readLine().split(" ");
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            sum = num1 + num2;
            sb.append("Case #");
            sb.append(i); 
            sb.append(": "); 
            sb.append(num1);
            sb.append(" + ");  
            sb.append(num2);  
            sb.append(" = ");  
            sb.append(sum); 
            sb.append("\n");
        }
        System.out.println(sb);
    }
}