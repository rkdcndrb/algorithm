import java.io.*;
import java.util.*;

public class Baekjoon10250 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			
			if(cnt%h == 0) arr[i] = h +  String.format("%02d", cnt/h);
			else arr[i] = cnt%h +  String.format("%02d", ((cnt/h)+1));
			
			//System.out.println(""+ cnt%h +  String.format("%02d", ((cnt/h)+1)));
		}
		for(String str : arr) System.out.println(str);
		
		bw.flush();
		br.close();
	}

}
