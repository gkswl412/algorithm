import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[] box = new int[n];
        
        // 배열 초기화
        for(int i=0; i<box.length; i++) {
            box[i] = i+1;
        }
        
        for(int i=0; i<m; i++) {
            String[] input = br.readLine().split(" ");
            int from = Integer.parseInt(input[0])-1;
            int to = Integer.parseInt(input[1])-1;
            
            int[] part = new int[to+1];
            for(int j=from; j<=to; j++) {
                part[j] = box[j];
            }
            
            for(int k=from; k<=to; k++) {
                box[k] = part[to-k+from];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<box.length; i++) {
            sb.append(box[i] + " ");
        }
        
        System.out.println(sb.toString().trim());
    }
}