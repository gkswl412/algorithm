import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] stringNumbers = br.readLine().split("");
        
        int[] numbers = new int[stringNumbers.length];
        
        for(int i=0; i<stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        
        new Main().sort(numbers);
        
        for(int i=0; i<numbers.length; i++) {
            sb.append(numbers[i]);
        }
        
        System.out.println(sb);
    }
    
    public void sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=0; j<arr.length-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}