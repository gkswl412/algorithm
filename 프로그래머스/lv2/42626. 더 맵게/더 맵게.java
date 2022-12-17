import java.util.Arrays;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        MinHeap minHeap = new MinHeap(scoville.length);
        
        for(int i=0; i<scoville.length; i++) {
            minHeap.add(scoville[i]);
        }
        
        while(minHeap.arr[1] < K) {
        	if(minHeap.size==1) {
        		answer = -1;
        		break;
        	}
            answer += 1;
            int a = minHeap.pop();
            int b = minHeap.pop();
            minHeap.add(a+2*b);
        }
        
        return answer;
    }
    
    class MinHeap {
        int size;
        int[] arr;
        final int maxVal = Integer.MAX_VALUE;
        
        public MinHeap(int n) {
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
                if(arr[i] < arr[i/2]) {
                    swap(i, i/2);
                }else {
                    break;
                }
            }
        }
        
        int pop() {
            int result = arr[1];
            arr[1] = arr[size];
            arr[size--] = maxVal;
            for(int i=1; i*2 <= size; ) {
                if(arr[i*2] < arr[i*2+1]) {
                    if(arr[i*2] < arr[i]) {
                        swap(i, i*2);
                        i = i*2;
                    }else {
                        break;
                    }
                }else {
                    if(arr[i*2+1] < arr[i]) {
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
}