import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		String input = "";
		Main main = new Main();
		
		while( (input = br.readLine()) != null ) {
			if(sb.length() > 0) {
				sb.append("\n");
			}
			int n = Integer.parseInt(input);
			String row = main.cantoriaSet((int) Math.pow(3, n));
			sb.append(row);
		}
		
		System.out.println(sb);
	}
	
	public String cantoriaSet(int n) {
		if (n == 1) {
			return "-";
		} else {
			int quotient = n/3;
			return cantoriaSet(quotient) + " ".repeat(quotient) + cantoriaSet(quotient);
		}
	}
}
