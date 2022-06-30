import java.util.*;
import java.io.*;

public class Baekjoon10815 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	map.put(Integer.parseInt(st.nextToken()), 1);
        }
        int chk = Integer.parseInt(br.readLine());
        StringTokenizer chkArr = new StringTokenizer(br.readLine());
        for(int i = 0; i < chk; i++) {
        	if(map.get(Integer.parseInt(chkArr.nextToken())) != null) {
        		System.out.print(1);
        	}else System.out.print(0);
        	if(i != chk-1) System.out.print(" ");
        }
        
        bw.flush();
        br.close();
    }
}