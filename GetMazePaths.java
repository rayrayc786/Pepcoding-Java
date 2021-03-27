import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
            ArrayList<String> ba=new ArrayList<>();
            return ba;
        }
         if(sr==dr && sc==dc){
            ArrayList<String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }
        ArrayList<String> mr=new ArrayList<>();
        ArrayList<String> rr1=getMazePaths(sr,sc+1,dr,dc);
        for(int i=0;i<rr1.size();i++){
            mr.add("h"+rr1.get(i));
        }
        ArrayList<String> rr2=getMazePaths(sr+1,sc,dr,dc);
         for(int i=0;i<rr2.size();i++){
            mr.add("v"+rr2.get(i));
        }
        return mr;
    }

}
