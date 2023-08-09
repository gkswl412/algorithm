import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        new Main().mergeSort(arr,0,n-1);
        
        for(int i=0; i<n; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        
        int i=0, j=0, k=left;
        
        while(leftArr.length > i && rightArr.length > j) {
            if(leftArr[i] > rightArr[j]) {
                arr[k++] = rightArr[j++];
            }else{
                arr[k++] = leftArr[i++];
            }
        }
        
        while(leftArr.length > i) {
            arr[k++] = leftArr[i++];
        }
        
        while(rightArr.length > j) {
            arr[k++] = rightArr[j++];
        }
    }
}