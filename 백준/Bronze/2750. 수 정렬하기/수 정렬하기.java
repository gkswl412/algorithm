import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 버블 정렬
        /* for(int i=0; i<n-1; i++) {
            for(int j=1; j<n-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        } */
        
        // 선택 정렬
        /* for(int i=0; i<n-1; i++) {
            int minValueIndex = i;
            for(int j=i; j<n; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        } */
        
        // 삽입 정렬
        for(int index = 1 ; index < arr.length ; index++){ // 1.
          int temp = arr[index];
          int prev = index - 1;
          while( (prev >= 0) && (arr[prev] > temp) ) {    // 2.
             arr[prev+1] = arr[prev];
             prev--;
          }
          arr[prev + 1] = temp;                           // 3.
       }
        
        for(int i=0; i<n; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}