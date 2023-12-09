import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] stringArr = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(stringArr[i]);
		}
		
		int[] resultArr = Arrays.copyOf(arr, n);
		
		new Main().mergeSort(arr, 0, n-1);
		
		arr = Arrays.stream(arr).distinct().toArray();
		
		for(int i=0; i<resultArr.length; i++) {
			int index = new Main().binarySearch(resultArr[i], 0, arr.length-1, arr);
			resultArr[i] = index;
		}
		
		for(int i=0; i<resultArr.length; i++) {
			sb.append(resultArr[i]).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}
	
	public int binarySearch(int target, int left, int right, int[] arr) {
		if(left <= right) {
			int mid = (left + right)/2;
			if(target > arr[mid]) {
				return binarySearch(target, mid+1, right, arr);
			}else if(target == arr[mid]){
				return mid;
			}else {
				return binarySearch(target, left, mid, arr);
			}
		} else {
			return -1;
		}
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
			}else {
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