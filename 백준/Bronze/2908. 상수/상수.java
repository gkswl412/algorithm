import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        Main main = new Main();
        
        String[] numbers = br.readLine().split(" ");
        int num1 = Integer.parseInt(main.reverse(numbers[0]));
        int num2 = Integer.parseInt(main.reverse(numbers[1]));
        
        System.out.println(num1>num2 ? num1 : num2);
    }
    
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            sb.append(String.valueOf(str.charAt(i)));
        }
        return sb.toString();
    }
}