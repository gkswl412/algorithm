import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        
        String[] nums = br.readLine().split(" ");
        
        if(nums[0].length() >= nums[1].length()) {
        	nums[1] = "0".repeat(nums[0].length() - nums[1].length()) + nums[1];
        }else {
        	nums[0] = "0".repeat(nums[1].length() - nums[0].length()) + nums[0];
        }
        
        String[] a = nums[0].split("");
        String[] b = nums[1].split("");
        
        int n = 0;
        
        if(a.length >= b.length) {
        	n = a.length;
        }else {
        	n = b.length;
        }
        
        
    	int temp = 0;

        for(int i=n-1; i>=0; i--) {
        	int sum = Integer.parseInt(a[i]) + Integer.parseInt(b[i]) + temp;
        	temp = 0;
        	if(i==0) {
        		if(sum>=10) {
            		sb.append(String.valueOf(sum).split("")[1]);
            		sb.append(String.valueOf(sum).split("")[0]);
        		}else {
        			sb.append(String.valueOf(sum).split("")[0]);
        		}
        		break;
        	}
        	if(sum>=10) {
        		temp = Integer.parseInt(String.valueOf(sum).split("")[0]);
        		sb.append(Integer.parseInt(String.valueOf(sum).split("")[1]));
        	}else {
        		sb.append(sum);
        	}
        }
        
        System.out.println(sb.reverse().toString());
    }
}