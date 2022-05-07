import java.util.*;
import java.io.*;

public class Baekjoon1026 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	A[i] = Integer.parseInt(st1.nextToken());
        	B[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += A[i] * B[n-1-i];
        }
        
        System.out.println(sum);
        
        bw.flush();
        br.close();
    }
}