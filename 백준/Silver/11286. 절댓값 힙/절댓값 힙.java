
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		AbsMinHeap absmHeap = new AbsMinHeap(n);
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input==0) {
				sb.append(absmHeap.pop()).append("\n");
			}else {
				absmHeap.add(input);
			}
		}
		
		System.out.println(sb);
	}

}

class AbsMinHeap {
	
	int size;
	int[] arr;
	final int maxValue = Integer.MAX_VALUE;
	
	public AbsMinHeap(int n) {
		arr = new int[n];
		Arrays.fill(arr, maxValue);
		size = 0;
	}
	
	void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void add(int x) {
		arr[++size] = x;
		for( int i=size; i>1; i/=2 ) {
			if( Math.abs(arr[i]) < Math.abs(arr[i/2]) ) {
				swap(i,i/2);
			}else if( Math.abs(arr[i]) == Math.abs(arr[i/2]) ){
				if( arr[i] < arr[i/2] ) {
					swap(i,i/2);
				}else {
					break;
				}
			}else {
				break;
			}
		}
	}
	
	int pop() {
		
		if(size==0) {
			return 0;
		}
		
		int result = arr[1];
		arr[1] = arr[size];
		arr[size--] = maxValue;
		
		for(int i=1; i*2<=size; ) {
			if( Math.abs(arr[i*2]) < Math.abs(arr[i*2+1]) ) {
				if( Math.abs(arr[i*2]) < Math.abs(arr[i]) ) {
					swap(i,i*2);
					i = i*2;
				}else if( Math.abs(arr[i*2]) == Math.abs(arr[i]) ) {
					if( arr[i*2] < arr[i] ) {
						swap(i,i*2);
						i = i*2;
					}else {
						break;
					}
				}else {
					break;
				}
			}else if( Math.abs(arr[i*2]) > Math.abs(arr[i*2+1]) ){
				if( Math.abs(arr[i*2+1]) < Math.abs(arr[i]) ) {
					swap(i,i*2+1);
					i = i*2+1;
				}else if( Math.abs(arr[i*2+1]) == Math.abs(arr[i]) ){
					if( arr[i*2+1] < arr[i] ) {
						swap(i,i*2+1);
						i = i*2+1;
					}else {
						break;
					}
				}else {
					break;
				}
			}else {
				if( arr[i*2] > arr[i*2+1] ) {
					if( Math.abs(arr[i*2+1]) < Math.abs(arr[i]) ) {
						swap(i, i*2+1);
						i = i*2+1;
					}else if( Math.abs(arr[i*2+1]) == Math.abs(arr[i]) ) {
						if( arr[i*2+1] < arr[i] ) {
							swap(i, i*2+1);
							i = i*2+1;
						}else {
							break;
						}
					}else {
						break;
					}
				}else {
					if( Math.abs(arr[i*2]) < Math.abs(arr[i]) ) {
						swap(i, i*2);
						i = i*2;
					}else if( Math.abs(arr[i*2]) == Math.abs(arr[i]) ) {
						if( arr[i*2] < arr[i] ) {
							swap(i, i*2);
							i = i*2;
						}else {
							break;
						}
					}else {
						break;
					}
				}
			}
		}
		
		return result;
	}
}
