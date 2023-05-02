import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        if(a+b+c!=180) {
            System.out.println("Error");
        }else {
            if(a==b && b==c) {
                System.out.println("Equilateral");
            }else if(a!=b && b!=c && a!=c) {
                System.out.println("Scalene");
            }else {
                System.out.println("Isosceles");
            }
        }
    }
}