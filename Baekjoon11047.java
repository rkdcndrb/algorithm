import java.util.*;
import java.io.*;

public class Baekjoon11047 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int won = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        int cnt = 0;
        
        for(int i = n-1; i >= 0; i--) {
        	if(arr[i] <= won) {
        		cnt += won/arr[i];
        		won -= won/arr[i] * arr[i];
        	}
        	if(won == 0) break;
        }
        
        System.out.println(cnt);
        
        bw.flush();
        br.close();
    }
}