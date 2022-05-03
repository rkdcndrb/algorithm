import java.util.*;
import java.io.*;

public class Baekjoon2693 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            ans[i] = arr[7];
        }
        
        for(int num : ans) {
            System.out.println(num);
        }
        
        bw.flush();
        br.close();
    }
}
