import java.util.*;
import java.io.*;

public class Baekjoon1009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int num = 1;
        	for(int j = 1; j <= b; j++) {
        		num = num*a%10;
        	}
        	if(num == 0) num = 10;
        	arr[i] = num;
        }
        
        for(int num : arr) System.out.println(num);
        
        bw.flush();
        br.close();
    }
}