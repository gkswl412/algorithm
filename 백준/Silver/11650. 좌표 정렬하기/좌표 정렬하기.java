import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        
        new Main().mergeSort(arr,0,n-1);
        
        for(int i=0; i<n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public void mergeSort(int[][] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public void merge(int[][] arr, int left, int mid, int right) {
        int[][] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[][] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        
        int i=0, j=0, k=left;
        
        while(i<leftArr.length && j<rightArr.length) {
            if(leftArr[i][0] > rightArr[j][0] || (leftArr[i][0] == rightArr[j][0] && leftArr[i][1] > rightArr[j][1])) {
                arr[k++] = rightArr[j++];
            }else {
                arr[k++] = leftArr[i++];
            }
        }
        
        while(i<leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        
        while(j<rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
}