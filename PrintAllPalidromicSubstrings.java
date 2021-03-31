import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int sp=0;sp<str.length();sp++){
		    for(int ep=sp;ep<str.length();ep++){
		        if(isPalindrome(str,sp,ep)==true){
		            for(int i=sp;i<=ep;i++){
		                System.out.print(str.charAt(i));
		            }
		            System.out.println();
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
	public static boolean isPalindrome(String str, int sp, int ep){
	    int left=sp;
	    int right=ep;
	    
	    while(left<right){
	        char lc=str.charAt(left);
	        char rc=str.charAt(right);
	        if(lc!=rc){
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

}
