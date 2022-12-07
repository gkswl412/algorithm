
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		MinHeap mHeap = new MinHeap(n);
		
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

class MinHeap {
	
	// Heap 자료구조의 Field
	int[] arr;
	int size;
	final int maxValue = Integer.MAX_VALUE;
	
	// Heap 자료구조의 생성자 : Heap Class를 instance화 할때 실행되며, Field들을 초기화 한다.
	public MinHeap(int n) {
		this.arr = new int[n];
		this.size = 0;
		Arrays.fill(arr, maxValue);
	}
	
	// 부모노드와 자식노드를 비교하여, 위치를 바꾸는 메서드
	void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// 자료 x를 heap 에 추가하는 메서드
	void add(int x) {
		arr[++size] = x;
		// i는 노드의 인덱스를 의미, i가 1이면 최상위 노드를 의미하므로, i=1일땐 더이상 부모 노드가 없으므로, i>1 때만 반복한다.
		for(int i=size; i>1; i/=2) {
			// 최소힙이므로 최상위 노드의 값은 자료들중 가장 작은 숫자여야 한다. 따라서, 자식노드가 부모노드보다 작을때 위치를 바꾼다.
			if( arr[i] < arr[i/2] ) {
				swap(i,i/2);
			}else {
				break;
			}
		}
	}
	
	// 최상위 노드를 삭제하는 메서드
	int pop() {
		
		if(size==0) {
			return 0;
		}
		
		int result = arr[1];
		arr[1] = arr[size];
		arr[size--] = maxValue;
		
		for(int i=1; i*2<=size; ) {
			if( arr[i*2] < arr[i*2+1] ) {
				if( arr[i*2] < arr[i] ) {
					swap(i,i*2);
					i = i*2;
				}else {
					break;
				}
			}else {
				if( arr[i*2+1] < arr[i] ) {
					swap(i,i*2+1);
					i = i*2+1;
				}else {
					break;
				}
			}
		}
		
		return result;
	}
}
