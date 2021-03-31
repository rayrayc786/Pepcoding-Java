import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch!=sb.charAt(sb.length()-1)){
		        sb.append(ch);
		    }
		    
		}
		return sb.toString();
	}

	public static String compression2(String str){
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(0));
		int counter=1;
		for(int i=1;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch==sb.charAt(sb.length()-1)){
		        counter++;
		    }else{
		        if (counter>1){
		        sb.append(counter);
		        }
		        sb.append(ch);
		        counter=1;
		    }
		    
		}
		if(counter>1){
		    sb.append(counter);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
