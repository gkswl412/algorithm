import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int i = Integer.parseInt(br.readLine());
        
        for(int n=1; true; n++) {
            if (i <= n*(n+1)/2) {
                int num1 = i - n*(n-1)/2;
                int num2 = n + 1 - num1;
                // 짝수층일 경우
                if (n%2 == 0) {
                    System.out.println(num1 + "/" + num2);
                    break;
                }
                // 홀수층일 경우
                else {
                    System.out.println(num2 + "/" + num1);
                    break;
                }
            }
        }
    }
}