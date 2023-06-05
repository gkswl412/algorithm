import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        String[] abcdef = br.readLine().split(" ");
        int a = Integer.parseInt(abcdef[0]);
        int b = Integer.parseInt(abcdef[1]);
        int c = Integer.parseInt(abcdef[2]);
        int d = Integer.parseInt(abcdef[3]);
        int e = Integer.parseInt(abcdef[4]);
        int f = Integer.parseInt(abcdef[5]);
        
        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if (a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}