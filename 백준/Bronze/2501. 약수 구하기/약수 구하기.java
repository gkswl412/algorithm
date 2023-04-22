import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        
        int result = new Main().minFactorFinder(N,K);
        
        System.out.println(result);
    }
    
    public int minFactorFinder(int n, int k) {
        int order = 0;
        for(int i=1; i<=n; i++) {
            if (n%i==0) {
                order += 1;
                if (order == k) {
                    return i;
                }
            }
        }
        return 0;
    }
}