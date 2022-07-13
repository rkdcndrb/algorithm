import java.util.*;
import java.io.*;

public class Baekjoon9184 {
	static int[][][] arr = new int[21][21][21];
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        while(true) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken());
        	
        	if(a == -1 && b == -1 && c == -1) break;
        	System.out.printf("w(%d, %d, %d) = %d", a,b,c,baek9184(a,b,c));
        	System.out.println();
        }
        
        bw.flush();
        br.close();
    }
    
    static int baek9184(int a, int b, int c) {
    	if(a <= 0 || b <= 0 || c <= 0) return 1;
    	else if(a > 20 || b > 20 || c > 20) return baek9184(20, 20, 20);
    	
    	if(arr[a][b][c] != 0) return arr[a][b][c];
    	
    	if(a < b && b < c) {
    		arr[a][b][c] = baek9184(a, b, c-1) + baek9184(a, b-1, c-1) - baek9184(a, b-1, c); 
    	}else {
    		arr[a][b][c] = baek9184(a-1,b,c) + baek9184(a-1,b-1,c)+baek9184(a-1,b,c-1)-baek9184(a-1,b-1,c-1);
    	}
    	return arr[a][b][c];
    	
    }
}