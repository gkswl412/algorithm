import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i=0; i<n; i++) {
            String[] word = br.readLine().split("");
            String row = new Main().isPalindrome(word, 0, word.length - 1, 0);
            sb.append(row).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public String isPalindrome(String[] word, int left, int right, int count) {
        count++;
        if (left >= right) {
            return "1 " + count;
        } else {
            if (word[left].equals(word[right])) {
                return isPalindrome(word, left + 1, right - 1, count);
            } else {
                return "0 " + count;
            }
        }
    }
}
