import java.io.*;
import java.util.*;

public class Baekjoon1715 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	    int sum = 0;
	    
	    for(int i = 0; i < N; i++) {
	    	pq.add(Integer.parseInt(br.readLine()));
	    }
	    
	    if(N == 1) sum = 0;
	    else {
	    	while(pq.size() > 1) {
	    		int a = pq.poll();
	    		int b = pq.poll();
	    		
	    		sum += a+b;
	    		
	    		pq.add(a+b);
	    	}
	    }
	    
	    System.out.println(sum);
	    
	    br.close();	
	}
}
