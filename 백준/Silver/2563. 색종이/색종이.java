import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        boolean[][] matrix = new boolean[100][100];
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
            String[] XY = br.readLine().split(" ");
            int X = Integer.parseInt(XY[0]) - 1;
            int Y = Integer.parseInt(XY[1]) - 1;
            
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    matrix[X+j][Y+k] = true;
                }
            }
        }
        
        int result = 0;
        
        for(int x=0; x<100; x++) {
            for(int y=0; y<100; y++) {
                if(matrix[x][y]) {
                    result += 1;
                }
            }
        }
        
        System.out.println(result);
    }
}