import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        
        Solution solution = new Solution(a, b);
        
        sb.append(solution.add() + "\n");
        sb.append(solution.substract() + "\n");
        sb.append(solution.multiply() + "\n");
        sb.append(solution.quotient() + "\n");
        sb.append(solution.remainder() + "\n");
        
        System.out.println(sb);
    }
}

class Solution{
    final int a;
    final int b;
    
    public Solution(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int add(){return a + b;}
    public int substract(){return a - b;}
    public int multiply(){return a * b;}
    public int quotient(){return a / b;}
    public int remainder(){return a % b;}
}