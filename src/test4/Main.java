package test4;

import java.util.*;
public class Main {

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String t = String.valueOf(s);
			answer.add(t);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = in.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

}
