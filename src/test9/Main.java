package test9;

import java.util.*;
public class Main {

	public int solution(String str) {
		int answer = 0;
		for(char s : str.toCharArray()) {
			if(s>=48 && s<=57) {
				answer = answer * 10 + (s-48);
			}
		}
		return answer;
	}
	
//		String answer = "";
//		for(char s : str.toCharArray()) {
//			if(Character.isDigit(s)) {
//				answer+=s;
//			}
//		}
//		return Integer.parseInt(answer);
//	}
		
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}
