import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon4619 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        int B = 0, N = 0;
        List<Integer> list = new ArrayList<>();
        while(true) {
        	st = new StringTokenizer(br.readLine());
        	B = Integer.parseInt(st.nextToken());
        	N = Integer.parseInt(st.nextToken());
        	if(B == 0 && N == 0) break;
        	
        	int gap = 1000000;
        	int ans = 0;
        	
        	int A = 1;
        	while(true) {
        		if(Math.abs((int)Math.pow(A, N)-B) < gap) {
        			gap = Math.abs((int)Math.pow(A, N)-B);
        			ans = A;
        		}
        		if(Math.pow(A, N) >= B*2) break;
        		A++;
        	}
        	list.add(ans);
        }
        
        for(int num : list) System.out.println(num);
        
        bw.flush();
        br.close();
	}

}
