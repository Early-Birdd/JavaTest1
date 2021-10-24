package test7;

import java.util.*;
public class Main {
	
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		for(int i=0; i<(str.length())/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				answer = "NO";
		}
//		String answer = "NO";
//		str = str.toUpperCase();
//		String tmp = new StringBuilder(str).reverse().toString();
//		if(str.equals(tmp))
//			answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}
