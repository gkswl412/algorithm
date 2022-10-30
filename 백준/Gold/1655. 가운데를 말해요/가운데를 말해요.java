import java.io.*;
public class Main {
	public static int[] maxHeap;
	public static int[] minHeap;
	public static int maxHeapSize = 0;
	public static int minHeapSize = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) 
	throws Exception {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		// 연산의 횟수 N
		int N = Integer.parseInt(br.readLine());
		
		// heap 초기화
		maxHeap = new int[N+1];
		minHeap = new int[N+1];
		
		// 연산 시작
		for(int i=0; i<N; i++){
			
			// 인풋값 x
			int x = Integer.parseInt(br.readLine());
			
			// 최대힙의 크기가 최소힙의 크기보다 크게 유지
			if(maxHeapSize == minHeapSize){
				pushMaxHeap(x);
				if(minHeapSize>0){
					swapMaxAndMin();
				}
			}else{
				pushMinHeap(x);
				swapMaxAndMin();
			}
			
		
			
			sb.append(maxHeap[1] + "\n");

		}
		System.out.println(sb);
	}
	
	public static void pushMaxHeap(int x){
		maxHeap[++maxHeapSize] = x;
		// 최대힙 정렬 
		for(int i=maxHeapSize; i>1; i/=2){
			if(maxHeap[i] > maxHeap[i/2]){
				swap(i, i/2, maxHeap);
			}else{
				break;
			}
		}
	}
	
	public static void pushMinHeap(int x){
		minHeap[++minHeapSize] = x;
		// 최소힙 정렬
		for(int i=minHeapSize; i>1; i/=2){
			if(minHeap[i] < minHeap[i/2]){
				swap(i, i/2, minHeap);
			}else{
				break;
			}
		}
	}
	
	public static void swap(int i, int j, int[] heap){
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public static void swapMaxAndMin(){
		if(maxHeap[1] > minHeap[1]){
			int temp = maxHeap[1];
			maxHeap[1] = minHeap[1];
			minHeap[1] = temp;
			
			// 최소힙 정렬
			for(int i=1; i*2<=minHeapSize; ){
				// 왼쪽 자식이 마지막 노드인 경우
				if(i*2==minHeapSize){
					if(minHeap[i] > minHeap[i*2]){
						swap(i,i*2,minHeap);
						i = i*2;
					}else{
						break;
					}
				// 오른쪽 자식이 마지막 노드인 경우
				}else{
					if(minHeap[i*2+1] > minHeap[i*2]){
						if(minHeap[i] > minHeap[i*2]){
							swap(i,i*2,minHeap);
							i = i*2;
						}else{
							break;
						}
					}else{
						if(minHeap[i] > minHeap[i*2+1]){
							swap(i,i*2+1,minHeap);
							i = i*2+1;
						}else{
							break;
						}
					}
				}
			}
			
			// 최대힙 정렬
			for(int i=1; i*2<=maxHeapSize; ){
				// 왼쪽 자식이 마지막 노드인 경우
				if(i*2==maxHeapSize){
					if(maxHeap[i] < maxHeap[i*2]){
						swap(i,i*2,maxHeap);
						i = i*2;
					}else{
						break;
					}
				// 오른쪽 자식이 마지막 노드인 경우
				}else{
					if(maxHeap[i*2+1] < maxHeap[i*2]){
						if(maxHeap[i] < maxHeap[i*2]){
							swap(i,i*2,maxHeap);
							i = i*2;
						}else{
							break;
						}
					}else{
						if(maxHeap[i] < maxHeap[i*2+1]){
							swap(i,i*2+1,maxHeap);
							i = i*2+1;
						}else{
							break;
						}
					}
				}
			}
			
		}
	}
}