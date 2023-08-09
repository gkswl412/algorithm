import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[10001];
        
        for(int i=0; i<n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[number]++;
        }
        
        for(int i=1; i<10001; i++) {
            if(arr[i] != 0) {
                for(int j=0; j<arr[i]; j++) {
                    sb.append(i).append("\n");
                }
            }
        }
        
        System.out.println(sb);
    }
}