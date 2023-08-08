import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        
        String[] stringScoresArr = br.readLine().split(" ");
        int[] scores = new int[n];
        
        for(int i=0; i<n; i++) {
            scores[i] = Integer.parseInt(stringScoresArr[i]);
        }
        
        new Main().sort(scores);
        
        System.out.println(scores[n-k]);
    }
    
    public void sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int prev = i-1;
            int temp = arr[i];
            while(prev >= 0 && arr[prev] > temp) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    }
}