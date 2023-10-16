import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	static int k = 0;
	static int result = -1;
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
     
        int[] arr = new int[n];
        
        String[] row = br.readLine().split(" ");
        
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(row[i]);
        }
        
        new Main().mergeSort(arr, 0, n-1);
        
        for(int i=0; i<n; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(result);
    }
    
    public void mergeSort(int[] arr, int left, int right) {
        if ( left < right ) {
        	int mid = ( left + right ) / 2;
        	mergeSort(arr, left, mid);
        	mergeSort(arr, mid + 1, right);
        	merge(arr, left, mid, right);
        }
    }
    
    public void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        
        int i=0, j=0, t=left;
        
        while(i < leftArr.length && j < rightArr.length) {
        	if (leftArr[i] > rightArr[j]) {
        		count++;
        		if (count == k) {
        			result = rightArr[j];
        		}
        		arr[t++] = rightArr[j++];
        	} else {
        		count++;
        		if (count == k) {
        			result = leftArr[i];
        		}
        		arr[t++] = leftArr[i++];
        	}
        }
        
        while(i < leftArr.length) {
        	count++;
        	if (count == k) {
    			result = leftArr[i];
    		}
        	arr[t++] = leftArr[i++];
        }
        
        while(j < rightArr.length) {
        	count++;
        	if (count == k) {
    			result = rightArr[j];
    		}
        	arr[t++] = rightArr[j++];
        }
    }
}