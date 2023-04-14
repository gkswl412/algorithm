import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[][] matrix = new String[15][15];
        
        for(int i=0; i<5; i++) {
            String[] row = br.readLine().split("");
            for(int j=0; j<row.length; j++) {
                matrix[i][j] = row[j];
            }
        }
        
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(matrix[j][i] != null) {
                    sb.append(matrix[j][i]);
                }
            }
        }
        
        System.out.println(sb);
    }
}