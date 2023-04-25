import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        String[] input3 = br.readLine().split(" ");
        
        String result = "";
        
        if(input1[0].equals(input2[0])) {
            result += input3[0];
        }else {
            if(input1[0].equals(input3[0])) {
                result += input2[0];
            }else {
                result += input1[0];
            }
        }
        
        if(input1[1].equals(input2[1])) {
            result += " " + input3[1];
        }else {
            if(input1[1].equals(input3[1])) {
                result += " " + input2[1];
            }else {
                result += " " + input1[1];
            }
        }
        
        System.out.println(result);
    }
}