import java.io.*;
import java.util.*;

public class Sultang2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int kg = Integer.parseInt(br.readLine());
		int result = 5000;
		int n = 0;
		
		for(int i = 0; i <= kg/5; i++) {
			int now = kg;
			now -= 5*i;
			if(now % 3 == 0) {
				n = i + now/3;
				if(result > n) result = n;
			}
			
		}
		if(result == 5000) System.out.println(-1);
		else System.out.println(result);
		
		br.close();
		bw.flush();
	}

}
