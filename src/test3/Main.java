package test3;

import java.util.Scanner;
public class Main {

	public String solution(String str) {
		String answer = "";
//		int max = Integer.MIN_VALUE;
//		String[] s = str.split(" ");
//		for(String x : s) {
//			int len = x.length();
//			if(len>max) {
//				max = len;
//				answer = x;
//			}
//		}
//		return answer;
		
		int max = Integer.MIN_VALUE, pos;
		while((str.indexOf(' '))!=-1){
			pos = str.indexOf(' ');
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}

}
