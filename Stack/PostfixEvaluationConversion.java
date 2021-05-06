import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack <Integer> vs= new Stack<>();
    Stack <String> in = new Stack<>();
    Stack <String> pre= new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            int val2=vs.pop();
            int val1=vs.pop();
            int val=operation(val1,val2,ch);
            vs.push(val);
            
            String ival2=in.pop();
            String ival1=in.pop();
            String ival="("+ ival1+ch+ival2+")";
            in.push(ival);
            
            String pval2=pre.pop();
            String pval1=pre.pop();
            String pval=ch+pval1+pval2;
            pre.push(pval);
        }else{
            vs.push(ch -'0');
            in.push(ch+"");
             pre.push(ch+"");
        }
    }
    System.out.println(vs.pop());
    System.out.println(in.pop());
    System.out.println(pre.pop());
    
 }
 public static int operation(int val1,int val2, char op){
        if(op=='+'){
            return val1+val2;
        }else if(op=='-'){
            return val1-val2;
        }else if(op=='*'){
            return val1*val2;
        }else{
            return val1/val2;
        }
    }
},  
