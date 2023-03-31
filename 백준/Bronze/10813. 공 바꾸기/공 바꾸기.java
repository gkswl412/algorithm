import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int[] baskets = new int[n];
        
        for(int i=0; i<baskets.length; i++) {
            baskets[i] = i+1;
        }
        
        for(int i=0; i<m; i++) {
            String[] numbers = br.readLine().split(" ");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            int temp = baskets[num1-1];
            baskets[num1-1] = baskets[num2-1];
            baskets[num2-1] = temp;
        }
        
        for(int num:baskets) {
            sb.append(num + " ");
        }
        
        System.out.println(sb.toString().trim());
    }
}