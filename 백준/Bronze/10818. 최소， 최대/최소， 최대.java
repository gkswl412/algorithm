import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        
        int min = 0;
        int max = 0;
        
        if(n == 1) {
            min = Integer.parseInt(numbers[0]);
            max = min;
            System.out.println(min + " " + max);
            return;
        }else {
            min = Integer.parseInt(numbers[0]);
            max = Integer.parseInt(numbers[1]);
            if(min > max) {
                int temp = min;
                min = max;
                max = temp;
            }
        }

        if(n > 2) {
            for(int i=2; i<n; i++) {
                int inputNumber = Integer.parseInt(numbers[i]);
                if(inputNumber < min) {
                    min = inputNumber;
                }else if(inputNumber > max) {
                    max = inputNumber;
                }
            }
        }
        
        System.out.println(min + " " + max);
    }
}