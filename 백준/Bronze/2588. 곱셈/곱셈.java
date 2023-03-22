import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String a = br.readLine();
        String b = br.readLine();
        
        new Main().solution(a, b);
    }
    
    public void solution(String a, String b) {
        int firstNum = Integer.parseInt(a);
        String[] arr = b.split("");
        int finalResult = 0;
        
        for(int i=arr.length; i>=0; i--) {
            if(i != 0) {
                int temp = firstNum * Integer.parseInt(arr[i-1]);
                finalResult += temp * Integer.parseInt("1" + "0".repeat(arr.length - i));
                System.out.println(temp);
            }else {
                System.out.println(finalResult);
            }
        }
    }
}