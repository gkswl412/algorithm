import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        // 삽입 정렬 (n 개의 데이터)
        for (int i=1; i<n; i++) {
            int temp = scores[i];
            int prev = i-1;
            while ( prev >= 0 && (scores[prev] < temp) ) {
                scores[prev+1] = scores[prev];
                prev--;
            }
            scores[prev+1] = temp;
        }
        
        System.out.println(scores[k-1]);
    }
}