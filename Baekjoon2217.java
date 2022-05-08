import java.util.*;
import java.io.*;

public class Baekjoon2217 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        int tot = 1;
        int sum = 0;
        for(int i = n-1; i >= 0; i--) {
        	if(arr[i] * tot > max) max = arr[i] * tot;
        	tot++;
        }
        
        System.out.println(max);
        
        bw.flush();
        br.close();
    }
}