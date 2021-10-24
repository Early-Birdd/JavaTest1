package test8;

import java.util.*;
public class Main {

	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
			answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}

}
