package test2;

import java.util.Scanner;
public class Main {

	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
//			if(x>=97 && x<=122) answer+=(char)(x-32);
//			else answer+=(char)(x+32);
//			대문자ascii : 65~90
//			소문자ascii : 97~122
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
