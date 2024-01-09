import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        Map<String, Integer> setA = new HashMap<String, Integer>();
        Map<String, Integer> setB = new HashMap<String, Integer>();

        for(int i=0; i<A.length; i++) {
            setA.put(A[i], 1);
        }

        for(int i=0; i<B.length; i++) {
            if(setA.containsKey(B[i])) {
                setB.put(B[i], 0);
            }
        }

        System.out.println(a+b-(setB.size()*2));
    }
}