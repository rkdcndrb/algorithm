import java.io.*;
import java.util.*;

public class Baekjoon1927 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    //StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(br.readLine());
	    PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
	    
	    for(int i = 0; i < N; i++) {
	    	int n = Integer.parseInt(br.readLine());
	    	
	    	if(n > 0) {
	    		pQ.add(n);
	    	}else {
	    		if(pQ.isEmpty()) System.out.println(0);
	    		else System.out.println(pQ.poll());
	    	}
	    }
	    
	    
	    
	    bw.flush();
	    br.close();	
	}
}
