import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int N = Integer.parseInt(br.readLine());
        int countOfGroupWord = 0;
        
        for(int i=0; i<N; i++) {
            String word = br.readLine();
            if(new Main().isGroupWord(word)) {
                countOfGroupWord++;
            }
        }
        
        System.out.println(countOfGroupWord);
    }
    
    public boolean isGroupWord(String word) {
        // 97 ~ 122 (a to z)
        boolean[] checker = new boolean[123];
        
        checker[(int) word.charAt(0)] = true;
        
        for(int i=1; i<word.length(); i++) {
            if(checker[(int) word.charAt(i)] && word.charAt(i-1) != word.charAt(i)) {
                return false;
            }
            checker[(int) word.charAt(i)] = true;
        }
        
        return true;
    }
}