import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int maxValue = 0;
        int X = 0;
        int Y = 0;
        int[][] matrix = new int[9][9];
        
        for(int i=0; i<9; i++) {
            String[] row = br.readLine().split(" ");
            for(int j=0; j<9; j++) {
            	int val = Integer.parseInt(row[j]);
                matrix[i][j] = val;
                if(val>maxValue) {
                    maxValue = val;
                }
            }
        }
        
        Loop1:
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(maxValue == matrix[i][j]) {
                    X = i+1;
                    Y = j+1;
                    break Loop1;
                }
            }
        }
        
        System.out.println(maxValue);
        System.out.println(X + " " + Y);
    }
}