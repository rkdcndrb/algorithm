import java.util.*;
import java.io.*;

public class Baekjoon1110 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(br.readLine());
        int n2 = n;
        
        int cnt = 0;
        while(true) {
        	if(n2 < 10) {
        		n2 = n2*10 + n2;
        	}else {
        		n2 = (n2%10)*10 + ((n2/10) + (n2%10))%10;
        	}
        	cnt++;
        	if(n == n2) break;
        }
        System.out.println(cnt);
        
        bw.flush();
        br.close();
    }
}