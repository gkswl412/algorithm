import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String time = br.readLine();
        int hour = Integer.parseInt(time.split(" ")[0]);
        int minute = Integer.parseInt(time.split(" ")[1]);
        
        int takenTime = Integer.parseInt(br.readLine());
        
        String result = new Main().solution(hour, minute, takenTime);
        
        System.out.println(result);
    }
    
    public String solution(int hour, int minute, int takenTime) {
        int sumOfMinute = minute + takenTime;
        if((hour + sumOfMinute/60) > 23) {
           return (hour + sumOfMinute/60 - 24) + " " + (sumOfMinute%60); 
        }
        return (hour + sumOfMinute/60) + " " + (sumOfMinute%60);
    }
}