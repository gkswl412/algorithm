import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(Integer.parseInt(br.readLine()));
        
        for (int i=1; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j=0; j<numbers.size(); j++) {
                if (numbers.get(j) > num) {
                    numbers.add(j, num);
                    break;
                } else {
                    if (j==numbers.size()-1) {
                        numbers.add(num);
                        /// numbers 리스트에 num 을 담게되면, 리스트의 크기가 1 커지게 된다.
                        /// break을 안해주면 무한으로 리스트에 같은 num 값을 담게 된다.
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        
        for (int i=0; i<numbers.size(); i++) {
            sb.append(numbers.get(i)).append("\n");
        }
        
        System.out.println(sb);
    }
}