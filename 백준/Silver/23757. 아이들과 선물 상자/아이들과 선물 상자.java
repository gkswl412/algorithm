
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		GiftBoxMaxHeap gbmHeap = new GiftBoxMaxHeap(N);
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			gbmHeap.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int giftCnt = gbmHeap.pop();
			int hopeCnt = Integer.parseInt(st.nextToken());
			if( giftCnt >= hopeCnt ) {
				int leftCnt = giftCnt - hopeCnt;
				if( leftCnt > 0 ) {
					gbmHeap.add(leftCnt);
				}
				continue;
			}else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
		return;
	}

}

class GiftBoxMaxHeap {
	
	int size;
	int[] arr;
	
	public GiftBoxMaxHeap(int n) {
		size = 0;
		arr = new int[n+1];
		Arrays.fill(arr, 0);
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
				swap(i, i/2);
			}else {
				break;
			}
		}
	}
	
	int pop() {
		int result = arr[1];
		
		arr[1] = arr[size];
		arr[size--] = 0;
		for( int i=1; i*2<=size; ) {
			if( arr[i*2] > arr[i*2+1] ) {
				if( arr[i*2] > arr[i] ) {
					swap(i*2,i);
					i = i*2;
				}else {
					break;
				}
			}else {
				if( arr[i*2+1] > arr[i] ) {
					swap(i*2+1,i);
					i= i*2+1;
				}else {
					break;
				}
			}
		}
		
		return result;
	}
}
