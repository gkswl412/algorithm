import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
    
        int[] arr = new int[5];
    
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    
        // 삽입 정렬 (n = 5)
        for (int i=1; i<5; i++) {
            int temp = arr[i];
            int prev = i-1;
            while (prev>=0 && (arr[prev] > temp)) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    
        int average = Arrays.stream(arr).sum() / 5;
    
        System.out.println(average);
        System.out.println(arr[2]);
    }
}