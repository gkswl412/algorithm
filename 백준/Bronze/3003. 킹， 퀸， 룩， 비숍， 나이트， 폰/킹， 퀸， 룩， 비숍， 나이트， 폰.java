import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int[] standard = {1, 1, 2, 2, 2, 8};
        String[] numbers = br.readLine().split(" ");
        int[] parsedNumbers = Stream.of(numbers).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0; i<6; i++) {
            sb.append(standard[i] - parsedNumbers[i]).append((i!=5) ? " ":"");
        }
        
        System.out.println(sb);
    }
}

// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개