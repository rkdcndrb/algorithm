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
        
        Arrays.sort(arr); // 입력 로프 정
        
        int tot = 1; //로프 총 개
        for(int i = n-1; i >= 0; i--) { // 최소 무게를 버틸 수 있는 로프의 최대 하중을 구하기 위한 역순 포
        	if(arr[i] * tot > max) max = arr[i] * tot; // 최소 무게를 버틸 수 있는 로프의 최대 하중의 무게 구하
        	tot++;
        }
        
        System.out.println(max);
        
        bw.flush();
        br.close();
    }
}