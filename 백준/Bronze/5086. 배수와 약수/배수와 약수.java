import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            // 테스트 케이스 입력 받기
            String input = br.readLine();
            
            // 테스트 케이스가 0 0 이면 종료
            if(input.equals("0 0")){
                break;
            }
            
            String[] inputArr = input.split(" ");
            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);
            
            if(a>b && a%b==0) {
                sb.append("multiple").append("\n");
            }else if(a<b && b%a==0){
                sb.append("factor").append("\n");
            }else {
                sb.append("neither").append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}