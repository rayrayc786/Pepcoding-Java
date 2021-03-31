import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		int n=str.length();
		int f=factorial(n);
		for(int i=0;i<f;i++){
		    int temp=i;
		    StringBuilder sb=new StringBuilder(str);
		    for(int j=n;j>=1;j--){
		        int q=temp/j;
		        int r=temp%j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
		
	}
	public static int factorial(int x){
		int val=1;
		for(int i=2;i<=x;i++){
		    val*=i;
		}
		return val;
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
