import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<str.length();i++){
		    char ch=str.charAt(i);
		    char pc=str.charAt(i-1);
		    sb.append(pc);
		    sb.append(ch-pc);
		}
        sb.append(str.charAt(str.length()-1));
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
