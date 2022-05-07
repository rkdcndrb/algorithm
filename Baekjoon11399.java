import java.util.*;
import java.io.*;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        int sum = 0, myTime = 0;
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        for(int num : arr) {
        	myTime = myTime + num;
        	sum += myTime;
        }
        System.out.println(sum);
        
        bw.flush();
        br.close();
    }
}