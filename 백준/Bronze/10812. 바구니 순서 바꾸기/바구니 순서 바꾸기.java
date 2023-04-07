import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        String[] arr = new String[N+1];
        for(int i=0; i<arr.length; i++) {
            arr[i] = String.valueOf(i);
        }
        
        for(int i=0; i<M; i++) {
        	sb = new StringBuilder();
            String[] numbers = br.readLine().split(" ");
            int start = Integer.parseInt(numbers[0]);
            int end = Integer.parseInt(numbers[1]);
            int mid = Integer.parseInt(numbers[2]);
            
            sb.append(0 + " ");
            
            for(int j=1; j<start; j++) {
                sb.append(arr[j]).append(" ");
            }
            
            for(int k=mid; k<=end; k++) {
                sb.append(arr[k]).append(" ");
            }
            
            for(int l=start; l<mid; l++) {
                sb.append(arr[l]).append(" ");
            }
            
            for(int m=end+1; m<arr.length; m++) {
                sb.append(arr[m]).append(" ");
            }

            arr = sb.toString().trim().split(" ");
        }
        
        sb = new StringBuilder();
        
        for(int i=1; i<arr.length; i++) {
        	sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}