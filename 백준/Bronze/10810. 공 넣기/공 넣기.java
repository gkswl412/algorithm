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
        
        for(int i=0; i<m; i++) {
            input = br.readLine().split(" ");
            int first = Integer.parseInt(input[0]) - 1;
            int second = Integer.parseInt(input[1]) - 1;
            int third = Integer.parseInt(input[2]);
            for(int j=first; j<=second; j++) {
                baskets[j] = third;
            }
        }
        
        for(int number:baskets) {
            sb.append(number + " ");
        }
        
        System.out.println(sb.toString().trim());
    }
}