import java.io.*;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 삽입 정렬 (Insertion Sort)
        for (int i=1; i<n; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
        
        
        Stream<Integer> stream = Arrays.stream(arr);
        
        stream.forEach(i -> sb.append(i).append("\n"));
        
        System.out.println(sb);
    }
}