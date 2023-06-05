import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        
        String[] input = br.readLine().split(" ");
        int[] cards = new int[n];
        for(int i=0; i<input.length; i++) {
            cards[i] = Integer.parseInt(input[i]);
        }
        
        int max = 0; // max <= m
        
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    int temp = cards[i] + cards[j] + cards[k];
                    if (temp > max && temp <= m) {
                        max = temp;
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}