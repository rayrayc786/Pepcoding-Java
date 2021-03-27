import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner (System.in);
        String str=scn.nextLine();
        System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {
        String[] Codes={
            ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
        };
        if(str.length()==0){
            ArrayList <String> ba=new ArrayList<>();
            ba.add("");
            return ba;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList <String> rr=getKPC(ros);
        ArrayList <String> mr=new ArrayList<>();
        String code=Codes[ch-'0'];
        
        for(int i=0;i<code.length();i++){
            char c=code.charAt(i);
            for(int j=0;j<rr.size();j++){
                mr.add(c+rr.get(j));
            }
        }
        return mr;
    }

}
