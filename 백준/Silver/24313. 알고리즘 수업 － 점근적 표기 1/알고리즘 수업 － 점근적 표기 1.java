import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        // f(n) = 7n + 7, g(n) = n, c = 8, n0 = 1이다. f(1) = 14, c × g(1) = 8이므로 
        // O(n) 정의를 만족하지 못한다.
        
        String[] ab = br.readLine().split(" ");
        long a = Long.parseLong(ab[0]);
        long b = Long.parseLong(ab[1]);
        long c = Long.parseLong(br.readLine());
        long n = Long.parseLong(br.readLine());
        
        long fN = a*n + b;
        long gN = n;
        
        if (a > c) {
            System.out.println(0);
        } else {
            if(fN <= c*gN) {
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }  
    }
}