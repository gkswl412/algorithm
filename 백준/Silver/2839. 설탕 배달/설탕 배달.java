import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // 변수 초기화
        int n = Integer.parseInt(br.readLine());
        int result = -1;
        int cnt5 = 0;
        int cnt3 = 0;
        
        // n이 3인 경우
        if (n==3) {
            result = 1;
        }
        
        // n이 5로 나누어 떨어지는 경우
        else if (n % 5 == 0) {
            result = n/5;
        }
        
        // n이 5보다 크고 5로 나누어 떨어지지 않는 경우
        else if (n >= 5 && n % 5 != 0) {
            cnt5 = (n/5) + 1;
            while(cnt5 != 0) {
                cnt5 -= 1;
                if ( (n - (cnt5 * 5)) % 3 == 0) {
                    cnt3 = (n - (cnt5 * 5)) / 3;
                    result = cnt3 + cnt5;
                    break;
                }
            }
        }
        
        System.out.println(result);
    }
}