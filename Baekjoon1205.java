import java.util.*;
import java.io.*;

public class Baekjoon1205 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        if(n == 0) System.out.println(1);
        else{
            Integer arr[] = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());
            
            if(n == p && score <= arr[arr.length-1]) System.out.println(-1);
            else {
                int pChk = 1;
                for(int num : arr) {
                    if(score < num) pChk++;
                    else break;
                }
                System.out.println(pChk);
            }
        }
        
        bw.flush();
        br.close();
    }
}
