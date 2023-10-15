import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
    
        int n = Integer.parseInt(br.readLine());
    
        System.out.println(new Main().factorial(n));
    }
    
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        long result = n;
    
        for (int i=n-1; i>0; i--) {
            result *= i;
        }
    
        return result;
    }
}