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
    
    // 오름차순 정렬(선택 정렬, selection sort)
    public void sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int maxIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}