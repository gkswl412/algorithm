import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	int[] arr;
	int length;
	
	public Main(int n) {
		this.arr = new int[n+1];
		Arrays.fill(arr, 0);
		this.length = 0;
	}
	
	void add(int n) {
		arr[++length] = n;
		for(int i=length; i>1; i/=2) {
			if(arr[i/2]<arr[i]) {
				swap(i/2,i);
			}else {
				break;
			}
		}
	}
	
	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	int pop() {
		
		if(length==0) {
			return 0;
		}
		
		int temp = arr[1];
		arr[1] = arr[length];
		arr[length--] = 0;
		for(int i=1; i*2 <= length;) {
			if(arr[i*2]>arr[i*2+1]) {
				if(arr[i*2]>arr[i]) {
					swap(i*2,i);
                    i = i*2;
                    continue;
				}else {
					break;
				}
			}else {
				if(arr[i*2+1]>arr[i]) {
					swap(i*2+1,i);
                    i = i*2+1;
                    continue;
				}else {
					break;
				}
			}
		}
        
        
		return temp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Main mHeap = new Main(n);
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input==0) {
				sb.append(mHeap.pop()).append("\n");
			}else {
				mHeap.add(input);
			}
		}
		
		System.out.println(sb);
	}

}
