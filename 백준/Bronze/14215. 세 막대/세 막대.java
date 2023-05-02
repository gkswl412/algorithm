import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        String[] abc = br.readLine().split(" ");
        int[] abcInt = new int[3];
        for(int i=0; i<abc.length; i++) {
        	abcInt[i] = Integer.parseInt(abc[i]);
        }
        Arrays.sort(abcInt);

        int a = abcInt[0];
        int b = abcInt[1];
        int c = abcInt[2];
        
        if(c<a+b) {
        	System.out.println(a+b+c);
        }else {
        	System.out.println(2*(a+b)-1);
        }
    }
}