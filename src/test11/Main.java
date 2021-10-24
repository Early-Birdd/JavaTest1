package test11;

import java.util.*;
public class Main {

	public String solution(String str) {
		String answer = "";
		str = str + " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				cnt+=1;
			}
			else {
				answer+=str.charAt(i);
				if(cnt>1) {
					answer+=String.valueOf(cnt);
				}
				cnt = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}
