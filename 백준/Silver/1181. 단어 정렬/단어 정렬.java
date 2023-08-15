import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        String[] words = new String[n];
        
        for(int i=0; i<n; i++) {
            words[i] = br.readLine();
        }
        
        words = Arrays.stream(words).distinct().toArray(String[]::new);

        new Main().mergeSort(words, 0, words.length-1);
        
        for(int i=0; i<words.length; i++) {
            sb.append(words[i]).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public void merge(String[] arr, int left, int mid, int right) {
        String[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        String[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        
        int i=0, j=0, k=left;
        
        while(i<leftArr.length && j<rightArr.length) {
            if(checker(leftArr[i], rightArr[j])) {
                arr[k++] = rightArr[j++];
            }else {
                arr[k++] = leftArr[i++];
            }
        }
        
        while(i<leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        
        while(j<rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
    
    public boolean checker(String leftWord, String rightWord) {
        if (leftWord.equals(rightWord)) {
            return false;
        }
        
        if (leftWord.length() > rightWord.length()) {
            return true;
        } 
        
        if (leftWord.length() < rightWord.length()) {
            return false;
        }
        
        if (leftWord.length() == rightWord.length()) {
            int i=0;
            
            while(i < leftWord.length() && (int)leftWord.charAt(i) == (int)rightWord.charAt(i)) {
                if (i != leftWord.length()-1) {
                    i++;
                }
            }
            
            if((int)leftWord.charAt(i) > (int)rightWord.charAt(i)) {
                return true;
            }
        }
        
        return false;
    }
}