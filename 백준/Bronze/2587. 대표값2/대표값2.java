import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int[] arr = new int[5];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        new Main().sort(arr);
        
        int sum = 0;
        
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        
        int average = sum / 5;
        int middleValue = arr[2];
        
        System.out.println(average);
        System.out.println(middleValue);
    }
    
    public void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    
}