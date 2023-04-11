import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        double sum = 0;
        double creditSum = 0;
        
        Main main = new Main();
        
        for(int i=0; i<20; i++) {
            String[] scoreInfo = br.readLine().split(" ");
            double credit = Double.parseDouble(scoreInfo[1]);
            String grade = scoreInfo[2];
            
            if(grade.equals("P")) {
                continue;
            }
            
            creditSum += credit;
            sum += (credit * main.gradeParser(grade));
        }
        
        System.out.println(sum/creditSum);
    }
    
    public double gradeParser(String grade) {
        if (grade.equals("A+")) {
            return 4.5;
        }else if (grade.equals("A0")) {
            return 4.0;
        }else if (grade.equals("B+")) {
            return 3.5;
        }else if (grade.equals("B0")) {
            return 3.0;
        }else if (grade.equals("C+")) {
            return 2.5;
        }else if (grade.equals("C0")) {
            return 2.0;
        }else if (grade.equals("D+")) {
            return 1.5;
        }else if (grade.equals("D0")) {
            return 1.0;
        }else if (grade.equals("F")) {
            return 0.0;
        }
        return 0.0;
    }
}