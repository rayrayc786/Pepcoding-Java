import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack <Integer> vs = new Stack <>();
    Stack <String> is= new Stack<>();
    Stack <String> ps=new Stack<>();
    
    for(int i=exp.length()-1;i>=0;i--){
        char ch= exp.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            int val1=vs.pop();
            int val2=vs.pop();
            int val=operation(val1,val2,ch);
            vs.push(val);
            
            String ival1=is.pop();
            String ival2=is.pop();
            String ival="("+ival1+ch+ival2+")";
            is.push(ival);
            
            String pval1=ps.pop();
            String pval2=ps.pop();
            String pval=pval1+pval2+ch;
            ps.push(pval);
        
        }else{
            vs.push(ch-'0');
            is.push(ch+"");
            ps.push(ch+"");
        }
    }
    System.out.println(vs.pop());
    System.out.println(is.pop());
    System.out.println(ps.pop());
 }
 public static int operation(int val1,int val2,char ch){
     if(ch=='+'){
         return val1+val2;
     }else if(ch=='-'){
         return val1-val2;
     }else if(ch=='*'){
         return val1*val2;
     }else {
         return val1/val2;
     }
 }
}
