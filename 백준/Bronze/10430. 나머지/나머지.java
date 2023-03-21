// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 
// 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        String[] arr = input.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        Solution solution = new Solution(a, b, c);
        
        sb.append(solution.res1() + "\n");
        sb.append(solution.res2() + "\n");
        sb.append(solution.res3() + "\n");
        sb.append(solution.res4() + "\n");
        
        System.out.println(sb);
    }
}

class Solution {
    final int a;
    final int b;
    final int c;
    
    public Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int res1() {
        return ( a + b ) % c;
    }
    
    public int res2() {
        return (( a % c ) + ( b % c )) % c;
    }
    
    public int res3() {
        return ( a * b ) % c;
    }
    
    public int res4() {
        return (( a % c ) * ( b % c )) % c;
    }
}