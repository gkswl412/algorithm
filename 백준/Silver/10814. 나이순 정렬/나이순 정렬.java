import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[][] userInfo = new String[n][2];
		
		String[] input = null;
		
		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			userInfo[i][0] = input[0];
			userInfo[i][1] = input[1];
		}
		
		new Main().mergeSort(userInfo, 0, n-1);
		
		for(int i=0; i<n; i++) {
			sb.append(userInfo[i][0] + " " + userInfo[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public void mergeSort(String[][] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public void merge(String[][] arr, int left, int mid, int right) {
		String[][] leftArr = Arrays.copyOfRange(arr, left, mid+1);
		String[][] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
		
		int i=0, j=0, k=left;
		
		while(leftArr.length > i && rightArr.length > j) {
			if(Integer.parseInt(leftArr[i][0]) > Integer.parseInt(rightArr[j][0])) {
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