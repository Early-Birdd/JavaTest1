package test10;

import java.util.*;
public class Main {

	public int[] solution(String str, char s) {
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i=0; i<str.length(); i++) {
			if(s==str.charAt(i)) {
				p=0;
				answer[i] = p;
			}		
			else {
				p++;
				answer[i] = p;
			}
		}
		for(int i=str.length()-1; i>=0; i--) {
			if(s==str.charAt(i)) {
				p=0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = Math.min(answer[i],p);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char s = in.next().charAt(0);
		for(int x : T.solution(str, s)) {
			System.out.print(x+" ");
		}
	}

}
