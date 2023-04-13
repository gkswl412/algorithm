import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        int[][] matrix = new int[N][M];
        
        for(int n=0; n<N; n++) {
            String[] row = br.readLine().split(" ");
            for(int m=0; m<M; m++) {
                matrix[n][m] = Integer.parseInt(row[m]);
            }
        }
        
        for(int n=0; n<N; n++) {
            String[] row = br.readLine().split(" ");
            for(int m=0; m<M; m++) {
                matrix[n][m] += Integer.parseInt(row[m]);
            }
        }
        
        for(int n=0; n<N; n++) {
            for(int m=0; m<M; m++) {
                sb.append(matrix[n][m]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}