import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println(new Main().solution());
    }
    
    public StringBuilder solution() {
        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\\n");
        sb.append(" )  ( \')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|");
        
        return sb;
    }
}