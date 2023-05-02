import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String numbers = br.readLine();
            if(numbers.equals("0 0 0")) {
                break;
            }
            String[] abc = numbers.split(" ");
            int a = Integer.parseInt(abc[0]);
            int b = Integer.parseInt(abc[1]);
            int c = Integer.parseInt(abc[2]);
            
            if(a+b<=c || a+c<=b || b+c<=a) {
                sb.append("Invalid").append("\n");
            }else {
                if(a==b && b==c) {
                    sb.append("Equilateral").append("\n");
                }else if(a!=b && b!=c && a!=c) {
                    sb.append("Scalene").append("\n");
                }else {
                    sb.append("Isosceles").append("\n");
                }
            }
        }
        
        System.out.println(sb);
    }
}