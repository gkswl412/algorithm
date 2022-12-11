
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		MxHeap maxHeap = new MxHeap(N);
		MnHeap minHeap = new MnHeap(N);
		
		for(int i=0; i<N; i++) {
			int input = Integer.parseInt(br.readLine());
			if( maxHeap.size <= minHeap.size ) {
				if( minHeap.arr[1] > input ) {
					maxHeap.add(input);
				}else {
					maxHeap.add(minHeap.pop());
					minHeap.add(input);
				}
			}else {
				if( maxHeap.arr[1] < input ) {
					minHeap.add(input);
				}else {
					minHeap.add(maxHeap.pop());
					maxHeap.add(input);
				}
			}
			sb.append(maxHeap.arr[1]).append("\n");
		}
		System.out.println(sb);
	}

}

class MxHeap {
	
	int size;
	int[] arr;
	final int minVal = -10001;
	
	public MxHeap(int n) {
		size = 0;
		arr = new int[n+1];
		Arrays.fill(arr, minVal);
	}
	
	void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void add(int x) {
		arr[++size] = x;
		for(int i=size; i>1; i/=2) {
			if( arr[i] > arr[i/2] ) {
				swap(i,i/2);
			}else {
				break;
			}
		}
	}
	
	int pop() {
		int result = arr[1];
		arr[1] = arr[size];
		arr[size--] = minVal;
		for( int i=1; i*2<=size; ) {
			if( arr[i*2] > arr[i*2+1] ) {
				if( arr[i*2] > arr[i] ) {
					swap(i,i*2);
					i = i*2;
				}else {
					break;
				}
			}else {
				if( arr[i*2+1] > arr[i] ) {
					swap(i, i*2+1);
					i = i*2+1;
				}else {
					break;
				}
			}
		}
		return result;
	}
}

class MnHeap {
	
	int size;
	int[] arr;
	final int maxVal = 10001;
	
	public MnHeap(int n) {
		size = 0;
		arr = new int[n+1];
		Arrays.fill(arr, maxVal);
	}
	
	void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void add(int x) {
		arr[++size] = x;
		for(int i=size; i>1; i/=2) {
			if( arr[i] < arr[i/2] ) {
				swap(i,i/2);
			}else {
				break;
			}
		}
	}
	
	int pop() {
		int result = arr[1];
		arr[1] = arr[size];
		arr[size--] = maxVal;
		for( int i=1; i*2<=size; ) {
			if( arr[i*2] < arr[i*2+1] ) {
				if( arr[i*2] < arr[i] ) {
					swap(i,i*2);
					i = i*2;
				}else {
					break;
				}
			}else {
				if( arr[i*2+1] < arr[i] ) {
					swap(i, i*2+1);
					i = i*2+1;
				}else {
					break;
				}
			}
		}
		return result;
	}
}
