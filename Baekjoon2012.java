import java.util.*;
import java.io.*;

public class Baekjoon2012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        for(int j = 0; j < n; j++) {
            if(arr[j] != j+1) {
                ans += Math.abs(arr[j] - (j+1));
            }
        }
        
        System.out.println(ans);
        
        bw.flush();
        br.close();
    }
}
