import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String input = br.readLine();
        Map<String, Boolean> partsString = new HashMap<String, Boolean>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                partsString.put(input.substring(j,j+i+1), true);
            }
        }

        System.out.println(partsString.size());
    }
}