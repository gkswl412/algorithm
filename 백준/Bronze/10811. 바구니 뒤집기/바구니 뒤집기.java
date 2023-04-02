import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        int[] baskets = new int[N+1];
        for(int i=0; i<baskets.length; i++) {
            baskets[i] = i;
        }
        
        for(int i=0; i<M; i++) {
            String[] FROMTO = br.readLine().split(" ");
            int FROM = Integer.parseInt(FROMTO[0]);
            int TO = Integer.parseInt(FROMTO[1]);
            
            while(FROM<TO) {
                int temp = baskets[FROM];
                baskets[FROM++] = baskets[TO];
                baskets[TO--] = temp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<baskets.length; i++) {
            sb.append(baskets[i] + " ");
        }
        
        System.out.println(sb.toString().trim());
    }
}