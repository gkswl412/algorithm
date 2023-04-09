import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            String[] caseInfo = br.readLine().split(" ");
            int caseCount = Integer.parseInt(caseInfo[0]);
            
            double sum = 0;
            for(int j=1; j<=caseCount; j++) {
                sum += Double.parseDouble(caseInfo[j]);
            }
            double average = (sum / caseCount);
            
            double aboveAverageCount = 0;
            for(int k=1; k<caseInfo.length; k++) {
                if(Double.parseDouble(caseInfo[k]) > average) {
                    aboveAverageCount += 1;
                }
            }
            
            double resultPerCase = (aboveAverageCount / caseCount) * 100; 
            sb.append(String.format("%.3f%s\n",resultPerCase,"%"));
        }
        
        System.out.println(sb.toString());
    }
}