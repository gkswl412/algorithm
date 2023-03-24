import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String input = br.readLine();
        
        int hour = Integer.parseInt(input.split(" ")[0]);
        int minute = Integer.parseInt(input.split(" ")[1]);
        
        String result = new Main().solution(hour, minute);
        
        System.out.println(result);
    }
    
    public String solution(int hour, int minute) {
        if(minute >= 45) {
            return hour + " " + (minute-45);
        }else if(hour == 0) {
            return 23 + " " + (minute+15);
        }
        return hour-1 + " " + (minute+15);
    }
}