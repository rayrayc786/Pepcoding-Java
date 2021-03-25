import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int fi=lastIndex(arr,0,x);
        System.out.println(fi);

    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int isa=lastIndex(arr,idx+1,x);
        if(isa!=-1){
            return isa;
        }
        if(arr[idx]==x){
            return idx;
        }else{
            return -1;
        }
    }

}
