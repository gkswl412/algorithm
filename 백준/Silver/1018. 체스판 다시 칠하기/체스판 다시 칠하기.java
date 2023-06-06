import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        String[][] board = new String[N][M];
        
        for (int i=0; i<N; i++) {
            String[] row = br.readLine().split("");
            for (int j=0; j<M; j++) {
                board[i][j] = row[j];
            }
        }
        
        int minCnt = 64;
        
        for (int i=0; i<N-7; i++) {
            for (int j=0; j<M-7; j++) {
                int repaintCnt = getRepaintCnt(board,i,j);
                if (minCnt > repaintCnt) {
                    minCnt = repaintCnt;
                }
            }
        }
        
        System.out.println(minCnt);
    }
    
    public static int getRepaintCnt(String[][] board, int N, int M) {
        int result = 0;
        for (int i=N; i<N+8; i++) {
            for (int j=M; j<M+8; j++) {
                if ( (i+j)%2 == 0 && !board[i][j].equals(board[0][0]) ) {
                    result++;
                } else if ( (i+j)%2 !=0 && board[i][j].equals(board[0][0]) ) {
                    result++;
                }
            }
        }
        if (result <= 32) {
            return result;
        }else {
            return 64 - result;
        }
    }
}