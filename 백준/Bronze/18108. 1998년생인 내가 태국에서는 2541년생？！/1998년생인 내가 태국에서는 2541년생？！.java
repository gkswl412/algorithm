//불기 = 서기 + 543
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int toAD(int input){
        return input - 543;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Main main = new Main();
        
        System.out.println(main.toAD(input));
    }
}