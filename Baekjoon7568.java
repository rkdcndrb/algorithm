import java.io.*;
import java.util.*;

public class Baekjoon7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int cnt[] = new int[n];
		for(int q = 0; q < n; q++) cnt[q] = 1;
		for(int j = 0; j < n; j++) {
			for(int k = 0; k < n; k++) {
				if(arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) {
					cnt[j]++;
				}
			}
		}
		
		for(int num : cnt) System.out.print(num + " ");
		
		bw.flush();
		br.close();
	}

}
