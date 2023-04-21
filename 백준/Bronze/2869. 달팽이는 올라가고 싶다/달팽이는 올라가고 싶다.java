import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] ABV = br.readLine().split(" ");
        int up = Integer.parseInt(ABV[0]);
        int down = Integer.parseInt(ABV[1]);
        int height = Integer.parseInt(ABV[2]);
        
        int day = 0;
        
        // 하루에 올라갈 수 있는 높이와 올라가야할 높이가 같은 경우
        if(up == height) {
        	day = 1;
        }
        
        int distancePerDay = up - down;
        int temp = height - up;
        
        while(temp % distancePerDay != 0) {
        	temp += 1;
        }
        
        day = temp / distancePerDay + 1;
        
        System.out.println(day);
    }
}