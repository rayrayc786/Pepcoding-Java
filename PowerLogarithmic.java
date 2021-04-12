import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        System.out.print(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int pw1=power(x,n/2);
        int pw2=pw1*pw1;
        if(n%2!=0){
            pw2=x*pw2;
        }
        return pw2;
    }

}
