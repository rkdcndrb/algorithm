import java.io.*;
import java.util.*;

public class Baekjoon17478 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(br.readLine());
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursion(cnt, 0);
		
		bw.flush();
		br.close();
	}
	
	public static void recursion(int n, int now) {
		printUnderbar(now);
		System.out.println("\"재귀함수가 뭔가요?\"");
		printUnderbar(now);
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		printUnderbar(now);
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		printUnderbar(now);
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		
		if(n > 1) recursion(n-1, ++now);
		if(n == 1){
			printUnderbar(++now);
			System.out.println("\"재귀함수가 뭔가요?\"");
			printUnderbar(now);
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			printUnderbar(now);
			System.out.println("라고 답변하였지.");
		}
		printUnderbar(--now);
		System.out.println("라고 답변하였지.");
	}
	
	public static void printUnderbar(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("____");
		}
	}
}
